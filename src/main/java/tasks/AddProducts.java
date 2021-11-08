package tasks;

import models.BuyerInformation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import userinterface.CheckOutPage;
import userinterface.ProductsPage;

import java.util.List;

import static net.serenitybdd.screenplay.actions.Enter.theValue;
import static userinterface.CheckOutPage.*;

public class AddProducts implements Task {
    private List<BuyerInformation> data;

    public AddProducts(List<BuyerInformation> data) {
        this.data = data;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ProductsPage.SAUCE_LABS_BACKPACK),
                Click.on(ProductsPage.SAUCE_LABS_BIKE_LIGHT),
                Click.on(ProductsPage.SAUCE_LABS_BOLT_TSHIRT),
                Click.on(ProductsPage.SAUCE_LABS_FLEECE_JACKET),
                Click.on(ProductsPage.SAUCE_LABS_FLEECE_ONESIE),
                Click.on(ProductsPage.TEST_ALL_THE_THINGS_TSHIRT));

        actor.attemptsTo(Scroll.to(SHOPPING_CART),
                Click.on(CheckOutPage.SHOPPING_CART));

        actor.attemptsTo(Scroll.to(BTN_CHECKOUT),
                Click.on(BTN_CHECKOUT));

        actor.attemptsTo(Click.on(LBL_FIST_NAME),
                theValue(data.get(0).getFirstName()).into(LBL_FIST_NAME),
                Click.on(LBL_LAST_NAME),
                theValue(data.get(0).getLastName()).into(LBL_LAST_NAME),
                Click.on(LBL_ZIP_POSTAL_CODE),
                theValue(data.get(0).getZipPostalCode()).into(LBL_ZIP_POSTAL_CODE));

        actor.attemptsTo(Scroll.to(BTN_FINISH));
    }

    public static AddProducts toCart(List<BuyerInformation> data) {
        return Tasks.instrumented(AddProducts.class, data);
    }

}

