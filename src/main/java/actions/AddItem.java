package actions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import pages.ProductPage;

public class AddItem {

    public static Performable toCart() {
        return Click.on(ProductPage.ADD_TO_CART_BUTTON);
    }
}
