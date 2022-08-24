package clases;

public class ClasePersona {

   // Diagrama: resources/clases-objetos.png
   /*
      * Clase:
      * - nombre de la clase : Persona
      * - atributos: nombre, genero, ocupacion
      * - metodos:
         * - obtenerName()
         * - obtenerGenero()
         * - obtenerOcupacion()
      * 
   */

   String nombre;
   String  apellido;

   public void deployInformation() {
      System.out.println("Nombre: " + nombre);
      System.out.println("Apellido: " + apellido);
   }
   
   

}
