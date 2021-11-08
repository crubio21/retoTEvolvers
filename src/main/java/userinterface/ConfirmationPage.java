package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConfirmationPage extends PageObject {

    public static final Target CONFIRMATION_MESSAGE = Target.the("Confirmation message").located(By.xpath("//h2[contains(text(),'THANK YOU FOR YOUR ORDER')]"));
    public static final Target ERROR_MESSAGE = Target.the("Error message").located(By.xpath("//body/div[@id='root']/div[1]/div[2]/div[1]/div[1]/div[1]/form[1]/div[3]/h3[1]"));

}
