
package tasks;


import models.Credentials;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import userinterface.LogInPage;


public class LogIn implements Task {


    @Managed
    WebDriver webDriver;

    @Override
    public <T extends Actor> void performAs(T actor) {
        Credentials credentials = Credentials.init();

        actor.attemptsTo(
                Click.on(LogInPage.USER),
                Enter.theValue(credentials.getUserWeb()).into(LogInPage.USER),
                Click.on(LogInPage.PASSWORD),
                Enter.theValue(credentials.getPassWeb()).into(LogInPage.PASSWORD),
                JavaScriptClick.on(LogInPage.BTN_LOGIN));
    }

    public static LogIn onPage() {
        return Tasks.instrumented(LogIn.class);
    }
}
