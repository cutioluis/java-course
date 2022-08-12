package testencapsu;

import contextoestatico.Persona;

public class PruebaPersonaEstatico {
   
   // Es static por que apunta a la carga de clases y no aa la carga de objetos
   public static void main(String[] args) {
      Persona perosna = new Persona("Nombre");
      Persona perosna1 = new Persona("Nombre");

      
      // Como modificamos el toString() ya no muestra el referencia de memoria
      // Ahora muestra los atributos que definimos en toString()
      System.out.println("Persona: " + perosna );
      System.out.println("Persona: " + perosna1 );

   }
}
