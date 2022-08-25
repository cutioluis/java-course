package testencapsu;

import polimorfismo.Jugador;
import polimorfismo.Persona;

public class JugadorPolimorfismo {

   // ! Cuando usaoms polimorfismo entra los conceptos
   // ! herencia > sobrescritura > polimorfismo
   public static void main(String[] args) {
      Persona persona = new Persona("Luis", 122);
      print(persona);

      // como podemos ver esta variable tabien puede apuntar a la referencia hijo de
      // la clase padre
      persona = new Jugador("Luis", 200, 172431321);

      print(persona);
   }

   // * Basicamente con un mismo tipo podemos ejecutar diferentes metodos de la
   // Esto es polimorfismo donde hacemos un metodo
   // clase padre o hijos
   // Mandamos un prametro de Persona
   // Llamamos a nuestro metodod obtenerDetalles que se ejecuta de acuerdo a la
   // referencia de memoria que seta apuntando
   public static void print(Persona persona) {
      System.out.println("Perosna de " + persona.obtenerDetalles());
   }
}
