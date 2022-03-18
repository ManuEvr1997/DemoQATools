package stepDefinitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import task.AlertsFrame;
import task.ElementsAndWebTable;
import task.Experimento;
import task.WidgetsDates;
import userinterfaces.HomePAge;

import java.util.List;


public class EjemploSemilleroSteps
{
    @Managed(driver="chrome")
    //CREAR VARIABLES DE NAVEGADOR Y ACTOR
    private WebDriver driver;
    private Actor actor=Actor.named("Global");
    private HomePAge homePage=new HomePAge();


    public EjemploSemilleroSteps() {
    }


    @Dado("que un cliente accede a la web de compras")
    public void queUnClienteAccederAlaWebDeComprar(){

        //INDICANDO AL ACTOR QUE PUEDE ACCEDER A UN NAVEGADOR
        actor.can(BrowseTheWeb.with(driver));

        driver.manage().window().maximize();

        //EL ACTOR FUE CAPAZ DE ABRIR
        actor.wasAbleTo(Open.browserOn((PageObject) homePage));

    }

    @Cuando("^el agrega el nombre (.*) con apellido (.*) email (.*) edad (.*) salario (.*) departamento (.*)")
    public void IngresarAElementsYWebtables(String nombre ,String apellido, String email, String edad,  String salario, String departamento) {

        //EL ACTOR ES CAPAZ DE HACER WASABLETO Y ENVIAMOS LOS PARAMETROS AL METODO

        actor.wasAbleTo(

                ElementsAndWebTable.Elements(nombre,apellido,email,edad,salario,departamento)
        //  BuscarProducto.conDescripcion(descripcion),
        //  AgregarProducto.cantidad(cantidad)
                 );

    }

    @Cuando("^el agrega la primera fecha (.*) y la segundo fecha (.*)")
    public void elAgregaUnRegistroAUnaTabla(String dateTime ,String dateAndHour) {

        //EL ACTOR ES CAPAZ DE HACER WASABLETO Y ENVIAMOS LOS PARAMETROS AL METODO

        actor.wasAbleTo(
                WidgetsDates.Widgets(dateTime,dateAndHour));

    }
    @Cuando("^el da click en el campo del modal (.*)")
    public void elDaClcikEnLosAlerts(String nombreModal) {

        //EL ACTOR ES CAPAZ DE HACER WASABLETO Y ENVIAMOS LOS PARAMETROS AL METODO

        actor.wasAbleTo(
                AlertsFrame.AlertsFrameOperation(nombreModal));

    }


    @Entonces("el ve los productos en el carrito de compras")
    public  void elVeLosProductosEnElCarritoDeCompras() {


    }

//  MERODOS CON VALOR

    /*
    @Cuando("^el agrega el nombre con apellido email edad salario departamento list")
    public void IngresarAElementsYWebtablesList(List<String>datos1) {

        //EL ACTOR ES CAPAZ DE HACER WASABLETO Y ENVIAMOS LOS PARAMETROS AL METODO

        actor.wasAbleTo(
                ElementsAndWebTable.Elements(datos1.get(0,1,2,3,4,5)));


    }

    @Cuando("^el agrega la primera fecha y la segundo fecha list")
    public void elAgregaUnRegistroAUnaTablaList (List<String>datos2) {

        //EL ACTOR ES CAPAZ DE HACER WASABLETO Y ENVIAMOS LOS PARAMETROS AL METODO

        actor.wasAbleTo(
                WidgetsDates.Widgets(datos2.get(0)));

    }

     */

    /*
    @Cuando("^el da click en el campo del modal lista")
    public void elDaClcikEnLosAlertsLista (List<String> datos) {

        //EL ACTOR ES CAPAZ DE HACER WASABLETO Y ENVIAMOS LOS PARAMETROS AL METODO

        actor.wasAbleTo(
                Experimento.ElementsTest(datos.get(nombre,apellido,email,edad,salario,departamento)),
                WidgetsDates.Widgets(datos.get(0)),
                AlertsFrame.AlertsFrameOperation(datos.get(0)));

    }


    @Entonces("el ve los productos en el carrito de compras")
    public  void elVeLosProductosEnElCarritoDeComprasLista() {


    }
*/


}