package starter;

import io.cucumber.java.Before;
import io.cucumber.java.ParameterType;
import lombok.Getter;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.util.EnvironmentVariables;

@Getter
public class ParameterDefinitions {

    private EnvironmentVariables environmentVariables;

    @ParameterType(".*")
    public Actor actor(String actorName) {
        return OnStage.theActorCalled(actorName).whoCan(BrowseTheWeb.with(Serenity.getDriver()));
    }

    @Before
    public void setTheStageAndConfigBaseUrl() {
        OnStage.setTheStage(new OnlineCast());
    }

}
