package actions;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import pages.LoginPage;

public class Login {

    public static Performable withCredentials(String username, String password) {
        return Task.where("Actor tries to login with following credentials username: {0} and password {1}",
                Enter.theValue(username).into(LoginPage.USERNAME_INPUT),
                Enter.theValue(password).into(LoginPage.PASSWORD_INPUT),
                Click.on(LoginPage.SUBMIT));
    }

}
