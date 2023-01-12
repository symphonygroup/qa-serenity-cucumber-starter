package actions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import pages.HomePage;

public class Select {

    public static Performable anItemWithName(String name){
        return Click.on(Target.the("item").located(By.linkText(name)));
    }
}
