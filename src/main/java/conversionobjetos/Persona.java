package conversionobjetos;

public class Persona {

   private String nombre;
   private int numero;

   public Persona() {
      System.out.println("Constructor Personas");
   }

   public Persona(String nombre, int numero) {
      this.nombre = nombre;
      this.numero = numero;
   }

   public String obtenerDetalles() {
      return "Nombre" + nombre + ", " + "Numero:" + numero;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public int getNumero() {
      return this.numero;
   }

   public void setNumero(int numero) {
      this.numero = numero;
   }

   @Override
   public String toString() {
      return "Persona [nombre=" + nombre + ", numero=" + numero + "]";
   }
   
}
