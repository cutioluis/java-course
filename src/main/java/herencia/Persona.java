package herencia;

public class Persona {
   
   // La herencia en java es como la herencia de la vida real
   // Tus papas heredaron alguna caracteristicas de sus papas > tus papas te
   // heredaron... el color de tus ojos etc

   protected String nombre;
   protected char genero;
   protected int edad;
   protected String direccion;

   // Constructores
   public Persona() {

   }

   public Persona(String nombre) {
      // Inicializa la variable nombre;
      this.nombre = nombre;
   }

   public Persona(String nombre, char genero, int edad, String direccion) {
      this.nombre = nombre;
      this.genero = genero;
      this.edad = edad;
      this.direccion = direccion;
   }

   // Metodos, Getters and Setters
   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public char getGenero() {
      return genero;
   }

   public void setGenero(char genero) {
      this.genero = genero;
   }

   public int getEdad() {
      if (edad <= 0) {
         System.out.println("Tu edad es: " + edad + " puedes iniciarla");
      }
      return edad;
   }

   public void setEdad(int edad) {
      this.edad = edad;
   }

   public String getDireccion() {
      return direccion;
   }

   public void setDireccion(String direccion) {
      this.direccion = direccion;
   }

   // Modificado
   // Con la palabra super accedemos a los valores antes de usar el toString modificado
   @Override
   public String toString() {
      return "Persona [direccion=" + direccion + ", edad=" + edad + ", genero=" + genero + ", nombre=" + nombre + ", " + super.toString() + "]";
   }
}
