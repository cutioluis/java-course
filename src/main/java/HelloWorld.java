import testencapsu.EmpleadoHerencia;

public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Buenos dias master!");

        /* Test de clase PruebaPersona que extiende desde Persona */
        EmpleadoHerencia empleado = new EmpleadoHerencia();
        System.out.println("Emplead, atributos extendidios de la clase Perosna : " + empleado);

    }
}
