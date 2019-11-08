package co.com.proyectobase.screenplay.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/features/compra_articulo.feature",
		glue="co.com.proyectobase.screenplay.stepdefinitions"
			)
public class RunnerTags {

}
