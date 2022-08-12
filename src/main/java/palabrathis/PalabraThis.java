
// Los paquetes se crean en minusculas como este paquete 
// * Arregalr el nombre de los paquetes anteriores

package palabrathis;

public class PalabraThis {

   public static void main(String[] args) {
      System.out.println("Nueva Clase");

      Persona persona = new Persona("Luis", "Cutiopala");
      System.out.println("Persona nombre: " + persona.nombre);
      System.out.println("Persona nombre: " + persona.apellido);
   }
}

class Persona {
   String nombre;
   String apellido;

   Persona(String nombre, String apellido) {
      // Llamada al constructorede la clase Object super();
      this.nombre = nombre;
      this.apellido = apellido;
      System.out.println("Objeto persona usando this: " + this);
      
      new Print().imprimit(this);
   }
}


class Print {

public Print() {
   super();
}

   public void imprimit(Persona persona) {
      System.out.println("Persona desde imprimir: " + persona);
      System.out.println(this);
   }

}