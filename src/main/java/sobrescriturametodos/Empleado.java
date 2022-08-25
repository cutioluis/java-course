package sobrescriturametodos;

public class Empleado {
   protected String nombre;
   protected Double sueldo;


   public Empleado() {
      
   }

   public Empleado(String nombre, Double sueldo) {
      this.nombre = nombre;
      this.sueldo = sueldo;
   }

   // ! Este metodo vamos a sobrescribir 
   public String obtenerDetalles() {
      return "Nombre: " + this.nombre + " " + "Sueldo:" + this.sueldo;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public Double getSueldo() {
      return sueldo;
   }

   public void setSueldo(Double sueldo) {
      this.sueldo = sueldo;
   }

   @Override
   public String toString() {
      return "Empleado [nombre=" + nombre + ", sueldo=" + sueldo + "]";
   }
   
}
