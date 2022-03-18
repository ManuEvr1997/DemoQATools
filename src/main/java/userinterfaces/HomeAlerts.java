package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://demoqa.com/")

public class HomeAlerts extends PageObject {
//SELECCIONAR NUESTRO PRIMER OBJETIVO DENTRO DE LA PAGINA


    public static final Target BARRA_ALERTS_FRAME =
            Target.the("CLICK EN BARRA DE ALERTS")
                    .located(By.xpath("//body/div[@id='app']/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[3]/span[1]/div[1]/div[1]"));
    public static final Target CLICK_ALERTS =
            Target.the("CLICK EN ALERTS")
                    .located(By.xpath("//span[contains(text(),'Alerts')]"));
    public static final Target BOTON_ALERT1 =
            Target.the("SELECCIONAR BOTON DE AGREGAR")
                    .located(By.xpath("//button[@id='alertButton']"));
    public static final Target BOTON_ALERT2 =
            Target.the("SELECCIONAR CAMPO DE PRIMER NOMBRE")
                    .located(By.xpath("//button[@id='timerAlertButton']"));
    public static final Target BOTON_ALERT3 =
            Target.the("SELECCIONAR CAMPO DE APELLIDO")
                    .located(By.xpath("//button[@id='confirmButton']"));
    public static final Target BOTON_ALERT4 =
            Target.the("SELECCIONAR CAMPO DE CORREO")
                    .located(By.xpath("//button[@id='promtButton']"));
    public static final Target CAMP_NOMBRE =
            Target.the("SELECCIONAR CAMPO DE NOMBRE")
                    .located(By.xpath("//android.widget.EditText[@resource-id='com.android.chrome:id/js_modal_dialog_prompt']"));


}
