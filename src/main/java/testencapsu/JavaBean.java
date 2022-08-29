package testencapsu;

import javabean.Persona;

public class JavaBean {
   public static void main(String[] args) {
      Persona persona = new Persona();
      // Dice que necesitamos agregar los elementos usando el set
      persona.setNombre("Luis");
      persona.setApellido("Cutiopala");
      System.out.println(persona);

      System.out.println("Persona nombre: " + persona.getNombre());
      System.out.println("Persona apellido: " + persona.getApellido());
   }
}
