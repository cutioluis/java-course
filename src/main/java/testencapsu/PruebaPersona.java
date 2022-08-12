package testencapsu;

// Para hacer imports es import > packageName.ClassType
// Podemos importar si tenemos mas de una clase asi: import.dominio.* ;
import dominioencapsu.Persona;

public class PruebaPersona {

   public static void main(String[] args) {
      Persona persona = new Persona("Luis", "Cutiopala", false, 0);

      // Get nos sirve para obtener el dato
      System.out.println("Persona nombre: " + persona.getNombre());

      // Set nos ayuda a modificar 
      persona.setNombre("Alex");
      System.out.println("Persona nombre: " + persona.getNombre());

      // Los otros metodos
      System.out.println("Persona estadoCivil: " + persona.isEstadoCivil());
      System.out.println("Persona hijos: " + persona.getHijos());
      
      System.out.println("Persona" + persona.toString());
   }
}
