package pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static Target USERNAME_INPUT = Target.the("Username input").located(By.id("loginusername"));

    public static Target PASSWORD_INPUT = Target.the("Password input").located(By.id("loginpassword"));

    public static Target SUBMIT = Target.the("Submit button").located(By.cssSelector("button[onclick='logIn()']"));
}
