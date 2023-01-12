package actions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import pages.HomePage;

public class Open {

    public static Performable theLoginForm() {
        return Click.on(HomePage.LOG_IN_BUTTON);
    }

    public static Performable theLaptopsMenu() {
        return Click.on(HomePage.CATEGORY_LAPTOPS);
    }

    public static Performable thePhonesMenu() {
        return Click.on(HomePage.CATEGORY_PHONES);
    }

    public static Performable theMonitorsMenu() {
        return Click.on(HomePage.CATEGORY_MONITORS);
    }

}
