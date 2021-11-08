package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.AfirmationException;
import models.BuyerInformation;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import questions.TextTarget;
import tasks.AddProducts;
import tasks.LogIn;
import tasks.OpenApp;
import userinterface.ConfirmationPage;
import util.CsvTransformer;

import java.io.IOException;

import static exceptions.AfirmationException.TEST_ERROR_EXCEPTION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.containsString;

public class LoginLockedUserStepDefinitios {

    @Managed
    WebDriver webDriver;

    @Before
    public void prepareScenario() {
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("Mariana").can(BrowseTheWeb.with(webDriver));
    }

    @After
    public void closeDriver() {
        webDriver.close();
    }

    BuyerInformation buyerInformation;

    @Given("^that the user is on the Saucedemo page$")
    public void thatTheUserIsLoggedIntoTheSaucedemoPage() {
        theActorInTheSpotlight().wasAbleTo(OpenApp.Page());
    }

    @When("^tries to log on$")
    public void triesToLogOn(){
        theActorInTheSpotlight().attemptsTo(LogIn.onPage()); }

    @Then("^the user should see the error message (.*)$")
    public void theUserShouldSeeTheErrorMessage(String message) {
        theActorInTheSpotlight().should(seeThat(TextTarget.textTarget(ConfirmationPage.ERROR_MESSAGE), containsString(message)).orComplainWith(AfirmationException.class, TEST_ERROR_EXCEPTION));
    }

}