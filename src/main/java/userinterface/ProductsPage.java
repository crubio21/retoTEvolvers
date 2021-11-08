package userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ProductsPage extends PageObject {

    public static final Target SAUCE_LABS_BACKPACK = Target.the("product 1").located(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
    public static final Target REMOVE_SAUCE_LABS_BACKPACK = Target.the("remove product 1").located(By.xpath("//button[@id='remove-sauce-labs-backpack']"));
    public static final Target SAUCE_LABS_BIKE_LIGHT = Target.the("product 2").located(By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']"));
    public static final Target REMOVE_SAUCE_LABS_BIKE_LIGHT = Target.the("remove product 2").located(By.xpath("//button[@id='remove-sauce-labs-bike-light']"));
    public static final Target SAUCE_LABS_BOLT_TSHIRT = Target.the("product 3").located(By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']"));
    public static final Target REMOVE_SAUCE_LABS_BOLT_TSHIRT = Target.the("remove product 3").located(By.xpath("//button[@id='remove-sauce-labs-bolt-t-shirt']"));
    public static final Target SAUCE_LABS_FLEECE_JACKET = Target.the("product 4").located(By.xpath("//button[@id='add-to-cart-sauce-labs-fleece-jacket']"));
    public static final Target REMOVE_SAUCE_LABS_FLEECE_JACKET = Target.the("remove product 4").located(By.xpath("//button[@id='remove-sauce-labs-fleece-jacket']"));
    public static final Target SAUCE_LABS_FLEECE_ONESIE = Target.the("product 5").located(By.xpath("//button[@id='add-to-cart-sauce-labs-onesie']"));
    public static final Target REMOVE_SAUCE_LABS_FLEECE_ONESIE = Target.the("remove product 5").located(By.xpath("//button[@id='remove-sauce-labs-onesie']"));
    public static final Target TEST_ALL_THE_THINGS_TSHIRT = Target.the("product 6").located(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));
    public static final Target REMOVE_TEST_ALL_THE_THINGS_TSHIRT = Target.the("remove product 6").located(By.xpath("//button[@id='add-to-cart-test.allthethings()-t-shirt-(red)']"));

}
