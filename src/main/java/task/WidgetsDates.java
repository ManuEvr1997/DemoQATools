package task;

import iteracciones.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePAge.*;
import static userinterfaces.HomeWidgets.*;

public class WidgetsDates implements Task {
    private static String dateTime;
    private static String dateAndHour;

    private Actor actor;

    //CREAR NUESTRO CONSTRUCTOR
    public WidgetsDates(String dateTime, String dateAndHour){
        //CREAR VARIABLE
        this.dateTime= dateTime;
        this.dateAndHour=dateAndHour;

    }

    public static WidgetsDates Widgets(String dateTime, String dateAndHour) {
        return instrumented(WidgetsDates.class,dateTime,dateAndHour);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                iteracciones.TiempoEspera.unMomento(2),
                //SCROLL PARA SELECCIONAR ELEMENTS
                Scroll.to(BARRA_WIDGETS),
                Click.on(BARRA_WIDGETS),//SELECCIONAR MODULO ELEMENTS
                TiempoEspera.unMomento(2),
                Click.on(DATA_PICKER),//CLICK EN MODULO DE TABLA
                TiempoEspera.unMomento(5),

                //Limpiar Barra
                Hit.the(Keys.SHIFT,Keys.HOME).into(CAMP_DATE_TIME),
                Hit.the(Keys.BACK_SPACE).into(CAMP_DATE_TIME),
                //Limpiar Barra

                Enter.theValue(dateTime).into(CAMP_DATE_TIME),//CLICK EN TABLA DE REGISTRO
                TiempoEspera.unMomento(2),

                Hit.the(Keys.ENTER).into(CAMP_DATE_TIME),//REALIZA UN ENTER SOBRE EL CAMPO DE BUSQUEDA

                //Click.on(dateMonthDateHour),
                TiempoEspera.unMomento(3),

                //Limpiar Barra
                Hit.the(Keys.SHIFT,Keys.HOME).into(CAMPO_DATE_TIME_HOUR),
                Hit.the(Keys.BACK_SPACE).into(CAMPO_DATE_TIME_HOUR),
                //Limpiar Barra

                Enter.theValue(dateAndHour).into(CAMPO_DATE_TIME_HOUR),//RECIBIR UN VALOR, DILIGENCIA CAMPO DE BUSQUEDA
                TiempoEspera.unMomento(2),

                Hit.the(Keys.ENTER).into(CAMPO_DATE_TIME_HOUR),//REALIZA UN ENTER SOBRE EL CAMPO DE BUSQUEDA

                TiempoEspera.unMomento(3));

    }

}