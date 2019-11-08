package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.PlazaveaHomePage;
import co.com.proyectobase.screenplay.userinterface.ProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class Ingresar implements Task {



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(PlazaveaHomePage.LABEL_SECCION_TECNOLOGIA));
        actor.attemptsTo(Click.on(PlazaveaHomePage.IMAGEN_PRODUCTO));


    }
    public static Ingresar ALaSeccion() {
        return Tasks.instrumented(Ingresar.class);
    }


}
