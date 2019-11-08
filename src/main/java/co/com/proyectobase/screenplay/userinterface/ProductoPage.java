package co.com.proyectobase.screenplay.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class ProductoPage extends PageObject {

    public static final Target BOTON_AAGREGAR_PRODUCTO = Target.the("Botón para agregar el producto").
            located(By.id("ProductCard__add-to-cart"));
    public static final Target BOTON_CARRITO_DE_COMPRA = Target.the("Botón para ingresar a carrito de compra").
            located(By.className("cart__ico"));

    public static final Target TEXTO_NOMBRE_DE_PRODUCTO = Target.the("Texto para confirmar el nombre del producto").
            located(By.className("minicart__card__name"));
}
