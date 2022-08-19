package arraysjava;

public class ArrayObject {
   public String nombre;

   public ArrayObject(String nombre) {
      this.nombre = nombre;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   @Override
   public String toString() {
      return "ArrayObject [nombre=" + nombre + super.toString() + "]";
   }

}
