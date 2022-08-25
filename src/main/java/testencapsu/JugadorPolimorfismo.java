package testencapsu;

import polimorfismo.Jugador;
import polimorfismo.Persona;

public class JugadorPolimorfismo {

   public static void main(String[] args) {
      Persona persona = new Persona("Luis", 122);
      // System.out.println(persona.obtenerDetalles());
      print(persona);

      Jugador jugador = new Jugador("Luis", 200, 172431321);
      // System.out.println(jugador.obtenerDetalles());
      print(jugador);
   }

   // Esto es polimorfismo donde hacemos un metodo
   // Mandamos un prametro de Persona 
   // Llamamos a nuestro metodod obtenerDetalles que se ejecuta de acuerdo a la referencia de memoria que seta apuntando
   public static void print(Persona persona) {
      System.out.println("Perosna de " + persona.obtenerDetalles());
   }
}
