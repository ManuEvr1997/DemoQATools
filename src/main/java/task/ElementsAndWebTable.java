package task;

import iteracciones.TiempoEspera;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterfaces.HomePAge.*;

public class ElementsAndWebTable implements Task {
    private static String nombre;
    private static String apellido;
    private static String email;
    private static String edad;
    private static String salario;
    private static String departamento;

    private Actor actor;

    //CREAR NUESTRO CONSTRUCTOR
    public ElementsAndWebTable(String nombre,String apellido,String email,String edad,String salario,String departamento){
        //CREAR VARIABLE
        this.nombre=nombre;
        this.apellido=apellido;
        this.email=email;
        this.edad=edad;
        this.salario=salario;
        this.departamento=departamento;


    }

    public static ElementsAndWebTable Elements(String nombre, String apellido, String email,String edad, String salario, String departamento) {
        return instrumented(ElementsAndWebTable.class,nombre,apellido,email,edad,salario,departamento);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(


                iteracciones.TiempoEspera.unMomento(2),
                Scroll.to(MODULO_ELEMENTS),//SCROLL PARA SELECCIONAR ELEMENTS
                Click.on(MODULO_ELEMENTS),//SELECCIONAR MODULO ELEMENTS
                TiempoEspera.unMomento(2),
                Click.on(CLICK_TABLE),//CLICK EN MODULO DE TABLA
                TiempoEspera.unMomento(2),
                Click.on (BOTON_AGREGAR),//CLICK EN TABLA DE REGISTRO
                TiempoEspera.unMomento(2),

                // REGISTRO DE FOMRULARIO
                Enter.theValue(nombre).into(FIRST_NAME),//RECIBIR UN VALOR, DILIGENCIA CAMPO DE BUSQUEDA
                TiempoEspera.unMomento(2),
                Enter.theValue(apellido).into(LAST_NAME),//RECIBIR UN VALOR, DILIGENCIA CAMPO DE BUSQUEDA
                TiempoEspera.unMomento(2),
                Enter.theValue(email).into(CAMP_EMAIL),//RECIBIR UN VALOR, DILIGENCIA CAMPO DE BUSQUEDA
                TiempoEspera.unMomento(2),
                Enter.theValue(edad).into(CAMP_EDAD),//RECIBIR UN VALOR, DILIGENCIA CAMPO DE BUSQUEDA
                TiempoEspera.unMomento(2),
                Enter.theValue(salario).into(CAMP_SALARIO),//RECIBIR UN VALOR, DILIGENCIA CAMPO DE BUSQUEDA
                TiempoEspera.unMomento(2),
                Enter.theValue(departamento).into(CAMP_DEPARTAMENTO),//RECIBIR UN VALOR, DILIGENCIA CAMPO DE BUSQUEDA
                TiempoEspera.unMomento(2),
                Click.on(CAMP_INFO),//SELECCIONAR IR A
                TiempoEspera.unMomento(2),
                Click.on(BOTON_ELIMINAR),//SELECCIONAR IR A
                TiempoEspera.unMomento(2));
    }


 //   public static AgregarProducto cantidad(String Cantidad){
 //       return instrumented(AgregarProducto.class,cantidad);

 //   }
}

