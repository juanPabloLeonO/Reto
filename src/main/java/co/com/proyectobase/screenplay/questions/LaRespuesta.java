package co.com.proyectobase.screenplay.questions;

import co.com.proyectobase.screenplay.userinterface.ProductoPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;

public class LaRespuesta implements Question<String> {

        @Override
    public String answeredBy(Actor actor) {
       return Text.of(ProductoPage.TEXTO_NOMBRE_DE_PRODUCTO).viewedBy(actor).asString();
    }

    public static LaRespuesta es() {
        return new LaRespuesta();
    }
}
