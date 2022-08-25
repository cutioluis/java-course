package polimorfismo;

public class Persona {

   private String nombre;
   private double sueldo;

   public Persona() {
      System.out.println("Persona Clase");
   }

   public Persona(String nombre, double sueldo) {
      this.nombre = nombre;
      this.sueldo = sueldo;
   }

   public String obtenerDetalles() {
      return "Nombre " + this.nombre + ", " + "Sueldo " + this.sueldo;
   }

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public Double getSueldo() {
      return this.sueldo;
   }

   public void setSueldo(Double sueldo) {
      this.sueldo = sueldo;
   }
}
