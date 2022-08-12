package testencapsu;

import contextoestatico.Persona;

public class PruebaPersonaEstatico {
   
   // Es static por que apunta a la carga de clases y no aa la carga de objetos
   public static void main(String[] args) {
      Persona perosna0 = new Persona("Nombre");
      Persona perosna1 = new Persona("Nombre");

      
      // Como modificamos el toString() ya no muestra el referencia de memoria
      // Ahora muestra los atributos que definimos en toString()
      System.out.println("Persona: " + perosna0 );
      System.out.println("Persona: " + perosna1 );

      System.out.println("-------------------------------------");
      Imprimir(perosna0);
      Imprimir(perosna1);

   }

   // Tiene que ser de tipo static para que pueda funcionar nuestro metodo
   public static void Imprimir(Persona persona) {
      System.out.println("Persona: " + persona);
   }

}
