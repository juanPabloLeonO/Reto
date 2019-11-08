package co.com.proyectobase.screenplay.stepdefinitions;

import co.com.proyectobase.screenplay.questions.LaRespuesta;
import co.com.proyectobase.screenplay.tasks.Abrir;
import co.com.proyectobase.screenplay.tasks.Agregar;
import co.com.proyectobase.screenplay.tasks.Ingresar;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

public class CompraVirtualStepDefinitions {

    @Managed(driver = "chrome")
    private WebDriver hisBrowser;
    private Actor juan = Actor.named("Juan");

    @Before
    public void configuracionInicial(){

        juan.can(BrowseTheWeb.with(hisBrowser));

    }

    @Given("^Juan quiere comprar un articulo en plazavea$")
    public void juan_quiere_comprar_un_articulo_en_plazavea() throws Exception {
        juan.wasAbleTo(Abrir.LaPaginaDePlazavea());

    }

    @When("^el selecciona el articulo que quiere comprar$")
    public void el_selecciona_el_articulo_que_quiere_comprar() throws Exception {
        juan.attemptsTo(Ingresar.ALaSeccion());
        juan.attemptsTo(Agregar.productoAlCarroDeCompra());
    }

    @Then("^el verifica que agrego el (.*) al carrito de compra$")
    public void el_verifica_que_agrego_el_articulo_al_carrito_de_compra(String producto) throws Exception {
        juan.should(GivenWhenThen.seeThat(LaRespuesta.es(), Matchers.equalTo(producto)));
    }

}
