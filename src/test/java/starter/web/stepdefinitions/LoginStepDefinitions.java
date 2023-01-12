package starter.web.stepdefinitions;

import actions.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.ensure.Ensure;

public class LoginStepDefinitions {

    @When("{actor} opens the application")
    public void opensTheApplication(Actor actor) {
        actor.attemptsTo(Navigate.toTheHomePage());
    }

    @When("{actor} logs into the application")
    public void logsIntoTheApplication(Actor actor) {
        actor.attemptsTo(
                Navigate.toTheHomePage(),
                Open.theLoginForm(),
                Login.withCredentials("username", "password"));
    }


    @Then("{actor} should be able to log in")
    public void shouldBeAbleToLogin(Actor actor) {
        actor.attemptsTo(
                Open.theLoginForm(),
                Login.withCredentials("username", "password"),
                Ensure.thatTheCurrentPage().title().isEqualTo("STORE")
        );
    }

    @Then("{actor} should be able to sign in with {string} and {string}")
    public void shouldBeAbleToSignInWithCredentials(Actor actor, String string, String string2) {
        actor.attemptsTo(
                Open.theLoginForm(),
                Login.withCredentials(string, string2),
                Ensure.thatTheCurrentPage().title().isEqualTo("STORE")
        );
    }

    @Then("{actor} should be able to place an order")
    public void shouldBeAbleToPlaceAnOrder(Actor actor) {
        actor.attemptsTo(
                Open.theLaptopsMenu(),
                Select.anItemWithName("Sony vaio i5"),
                AddItem.toCart()
        );
        actor.attemptsTo(
                Ensure.that(Serenity.getDriver().switchTo().alert().getText()).contains("Product added")
        );
    }

}

