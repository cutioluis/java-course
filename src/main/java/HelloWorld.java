
import java.time.LocalDate;

import testencapsu.ClienteHerencia;
import testencapsu.EmpleadoHerencia;

public class HelloWorld {
    public static void main(String args[]) {

        /* Empleado Herencia */

        /* Test de clase PruebaPersona que extiende desde Persona */
        EmpleadoHerencia empleado = new EmpleadoHerencia("Luis", 200);
        System.out.println("Empleado 0: " + empleado);

        EmpleadoHerencia empleado1 = new EmpleadoHerencia("Empleado1: " + "David", 2000);
        System.out.println(empleado1);
        System.out.println(empleado1.getEdad());

        
        /* Cliente Herencia */
        ClienteHerencia cliente = new ClienteHerencia("Luis", true, LocalDate.now());
        System.out.println(cliente);
        ClienteHerencia cliente1 = new ClienteHerencia("Luis", true, LocalDate.now());
        System.out.println(cliente1);
    }
}
