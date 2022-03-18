package userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;


@DefaultUrl("https://demoqa.com/")

public class HomeWidgets extends PageObject {
//SELECCIONAR NUESTRO PRIMER OBJETIVO DENTRO DE LA PAGINA


    public static final Target BARRA_WIDGETS =
            Target.the("CLICK EN BARRA WIDGETS")
                    .located(By.xpath("//*[@class='left-pannel']/div/div[4]"));
    public static final Target DATA_PICKER =
            Target.the("CLICK EN DATA PICKER")
                    .located(By.xpath("//*[@class='element-list collapse show']/ul/li[3]"));
    public static final Target CAMP_DATE_TIME =
            Target.the("SELECCIONAR PRIMER CAMPO DE DATE")
                    .located(By.xpath("//*[@id='datePickerMonthYearInput']"));
    public static final Target CAMPO_DATE_TIME_HOUR =
            Target.the("SELECCIONAR SEGUNDO CAMPO DE DATE CON HOUR")
                    .located(By.id("dateAndTimePickerInput"));

    // TABAL DE REGISTRO

  /*  public static final Target FIRST_NAME =
            Target.the("SELECCIONAR CAMPO DE PRIMER NOMBRE")
                    .located(By.xpath("//input[@placeholder='First Name']"));
    public static final Target LAST_NAME =
            Target.the("SELECCIONAR CAMPO DE APELLIDO")
                    .located(By.xpath("//input[@placeholder='Last Name']"));
    public static final Target CAMP_EMAIL =
            Target.the("SELECCIONAR CAMPO DE CORREO")
                    .located(By.xpath("//input[@id='userEmail']"));
    public static final Target CAMP_EDAD =
            Target.the("SELECCIONAR CAMPO DE EDAD")
                    .located(By.xpath("//input[@id='age']"));
    public static final Target CAMP_SALARIO =
            Target.the("SELECCIONAR CAMPO DE SALARIO")
                    .located(By.xpath("//input[@id='salary']"));
    public static final Target CAMP_DEPARTAMENTO =
            Target.the("SELECCIONAR CAMPO DE DEPARTAMENTO")
                    .located(By.xpath("//input[@id='department']"));
    public static final Target CAMP_INFO =
            Target.the("SELECCIONAR CAMPO DE ENVIAR INFO")
                    .located(By.xpath("//button[@id='submit']"));
    public static final Target BOTON_ELIMINAR =
            Target.the("SELECCIONAR BOTON ELIMINAR")
                    .located(By.xpath("//span[@id='delete-record-2']"));

                    */
}