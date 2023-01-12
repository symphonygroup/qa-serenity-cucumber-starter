package actions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate {

    public static Performable toTheHomePage(){
        return Open.url("https://www.demoblaze.com/");
    }


}
