package userinterface;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;


public class CheckOutPage extends PageObject {

    public static final Target SHOPPING_CART = Target.the("shopping cart").located(By.xpath("//body/div[@id='root']/div[@id='page_wrapper']/div[@id='contents_wrapper']/div[@id='header_container']/div[1]/div[3]/a[1]"));
    public static final Target BTN_CHECKOUT = Target.the("button checkout").located(By.xpath("//button[@id='checkout']"));
    public static final Target LBL_FIST_NAME = Target.the("first name").located(By.xpath("//input[@id='first-name']"));
    public static final Target LBL_LAST_NAME = Target.the("last name").located(By.xpath("//input[@id='first-name']"));
    public static final Target LBL_ZIP_POSTAL_CODE = Target.the("zip - postal code").located(By.xpath("//input[@id='first-name']"));
    public static final Target BTN_FINISH = Target.the("button finish").located(By.xpath("//input[@id='first-name']"));


}
