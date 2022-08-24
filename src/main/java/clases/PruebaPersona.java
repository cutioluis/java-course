package clases;

public class PruebaPersona {
   public static void main(String[] args) {
      // Crearemos objetos a partir de la clase Persona


      // Crearemos nuestro ojeto, y tiene una referencia en memoria
      ClasePersona persona1 = new ClasePersona();

      // Atributos
      persona1.nombre = "Luis";
      persona1.apellido = "Cutio";

      // metodos
      persona1.deployInformation();

      ClasePersona persona2 = new ClasePersona();
      persona2.nombre = "Alex";
      persona2.apellido = "Cutio";
      persona2.deployInformation();
   
      // Referencia de memoria 
      System.out.println(persona1);      
      System.out.println(persona2);

   }
}
