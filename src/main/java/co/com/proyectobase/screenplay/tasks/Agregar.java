package co.com.proyectobase.screenplay.tasks;

import co.com.proyectobase.screenplay.userinterface.ProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class Agregar implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ProductoPage.BOTON_AAGREGAR_PRODUCTO));
        actor.attemptsTo(Click.on(ProductoPage.BOTON_CARRITO_DE_COMPRA));

    }

    public static Agregar productoAlCarroDeCompra() {
        return Tasks.instrumented(Agregar.class);
    }


}
