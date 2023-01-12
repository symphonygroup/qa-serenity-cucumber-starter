package pages;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {

    public static Target LOG_IN_BUTTON = Target.the("Log in button").located(By.id("login2"));

    public static Target CATEGORY_PHONES = Target.the("Category phones button").located(By.cssSelector("a[onclick='byCat('phone')']"));

    public static Target CATEGORY_LAPTOPS = Target.the("Category laptops button").located(By.linkText("Laptops"));

    public static Target CATEGORY_MONITORS = Target.the("Category monitors").located(By.cssSelector("a[onclick='byCat('monitor')']"));
}
