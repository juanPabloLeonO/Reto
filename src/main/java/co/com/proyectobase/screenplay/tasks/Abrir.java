package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.PlazaveaHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class Abrir implements Task {
    private PlazaveaHomePage plazaveaHomePage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(plazaveaHomePage));

    }

    public static Abrir LaPaginaDePlazavea() {
        return Tasks.instrumented(Abrir.class);
    }
}
