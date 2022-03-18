package task;


import iteracciones.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.openqa.selenium.Alert;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomeAlerts.*;

public class AlertsFrame implements Task {
    private static String nombreModal;
    private Actor actor;

    //CREAR NUESTRO CONSTRUCTOR
    public AlertsFrame(String nombreModal){
        //CREAR VARIABLE
    this.nombreModal=nombreModal;
    }

    public static AlertsFrame AlertsFrameOperation(String nombreModal) {
        return instrumented(AlertsFrame.class,nombreModal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                TiempoEspera.unMomento(3),
                Click.on(BARRA_ALERTS_FRAME),
                Scroll.to(CLICK_ALERTS),
                Click.on(CLICK_ALERTS),
                TiempoEspera.unMomento(6),
                Click.on(BOTON_ALERT1),
                TiempoEspera.unMomento(6));
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss();
        TiempoEspera.unMomento(6);

        actor.attemptsTo(

                Click.on(BOTON_ALERT2),
                TiempoEspera.unMomento(5));
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss();

        actor.attemptsTo(
                Click.on(BOTON_ALERT3),
                TiempoEspera.unMomento(5));
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

        actor.attemptsTo(
                Click.on(BOTON_ALERT3),
                TiempoEspera.unMomento(5));
        BrowseTheWeb.as(actor).getDriver().switchTo().alert().dismiss();

        actor.attemptsTo(
                Click.on(BOTON_ALERT4),
                TiempoEspera.unMomento(5));

      Alert alert = BrowseTheWeb.as(actor).getDriver().switchTo().alert();

      TiempoEspera.unMomento(5);
      alert.sendKeys(String.valueOf(nombreModal));

        TiempoEspera.unMomento(15);

        BrowseTheWeb.as(actor).getDriver().switchTo().alert().accept();

        actor.attemptsTo(TiempoEspera.unMomento(5));

    }


}
