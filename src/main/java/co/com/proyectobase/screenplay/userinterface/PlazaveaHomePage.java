package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;


@DefaultUrl("https://www.plazavea.com.pe/")
public class PlazaveaHomePage extends PageObject {

    public static final Target LABEL_SECCION_TECNOLOGIA = Target.the("Label para ingresar a la sección tecnología").
            located(By.xpath("/html/body/div[3]/main/section[2]/div[4]/a"));

    public static final Target IMAGEN_PRODUCTO = Target.the("Imagen del producto a comprar").
            located(By.xpath("//*[@id='seccion-tecnologia']/div[2]/div[1]/a"));

}
