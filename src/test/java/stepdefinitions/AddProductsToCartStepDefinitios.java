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

import static org.hamcrest.Matchers.containsString;

import java.io.IOException;

import static exceptions.AfirmationException.TEST_ERROR_EXCEPTION;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AddProductsToCartStepDefinitios {

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

    @Given("^that the user is logged into the Saucedemo page$")
    public void thatTheUserIsLoggedIntoTheSaucedemoPage() {
        theActorInTheSpotlight().wasAbleTo(OpenApp.Page());
        theActorInTheSpotlight().attemptsTo(LogIn.onPage());
    }

    @When("^selects the products and adds them to the shopping cart (.*)$")
    public void selectsTheProductsAndAddsThemToTheShoppingCart(String information) throws IOException {
        buyerInformation = new BuyerInformation(CsvTransformer.getRowsCsv("information", information));
        theActorInTheSpotlight().attemptsTo(AddProducts.toCart(buyerInformation.thisInformation()));
    }

    @Then("^the user should see the message (.*)$")
    public void theUserShouldSeeTheMessage(String message) {
        theActorInTheSpotlight().should(seeThat(TextTarget.textTarget(ConfirmationPage.CONFIRMATION_MESSAGE), containsString(message)).orComplainWith(AfirmationException.class, TEST_ERROR_EXCEPTION));
    }

}