import testencapsu.EmpleadoHerencia;

public class HelloWorld {
    public static void main(String args[]) {
        System.out.println("Buenos dias master!");

        /* Test de clase PruebaPersona que extiende desde Persona */
        EmpleadoHerencia empleado = new EmpleadoHerencia("Luis", 200);
        System.out.println("Empleado 0: " + empleado);

        EmpleadoHerencia empleado1 = new EmpleadoHerencia("Empleado1: " + "David", 2000);
        System.out.println(empleado1);

        System.out.println(empleado1.getEdad());

    }
}
