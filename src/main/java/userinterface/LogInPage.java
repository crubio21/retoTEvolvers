package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LogInPage extends PageObject {

    public static final Target USER = Target.the("user").located(By.xpath("//input[@id='user-name']"));
    public static final Target PASSWORD = Target.the("password").located(By.xpath("//input[@id='password']"));
    public static final Target BTN_LOGIN = Target.the("button login").located(By.xpath("//input[@id='login-button']"));

}
