package actions;

import enums.MenuType;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Browse {

    public static Performable items(MenuType items) {
        return Task.where("Actor opens the {0} menu",
                switch (items) {
                    case PHONES -> Open.thePhonesMenu();
                    case LAPTOPS -> Open.theLaptopsMenu();
                    case MONITORS -> Open.theMonitorsMenu();
                });
    }
}
