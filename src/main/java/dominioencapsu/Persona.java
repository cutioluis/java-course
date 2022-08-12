// El paquete normalmente solo se llama dominio
package dominioencapsu;

public class Persona {
   // Decimo sque va aser privada para que otras calses no puedan acceceder a
   // nuestro metodos o modificarlas

   // * Atributos
   private String nombre;
   private String apellido;
   private boolean estadoCivil;
   private int hijos;

   // * Constructor
   public Persona(String nombre, String apellido, boolean estadoCivil, int hijos) {
      this.nombre = nombre;
      this.apellido = apellido;
      this.estadoCivil = estadoCivil;
      this.hijos = hijos;
   }

   // * Getters and setters
   // Estas :funciones" nos ayudan a poder usar estos metodos fuera de esta clase o
   // paquete, ya que al decir que nuestros atributos son privados solo podemos
   // usar dentro de esta clase

   public String getNombre() {
      return this.nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellido() {
      return this.apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   // * Boolean
   // Para los atributos que contengan un BOOLEANO necesitamos hacer
   // no get si no IsEstadoCivil ???? -- Se entiende no
   public boolean isEstadoCivil() {
      return this.estadoCivil;
   }

   public void setEstadoCivil(boolean isEstadoCivil) {
      this.estadoCivil = isEstadoCivil;
   }

   public int getHijos() {
      return this.hijos;
   }

   public void setHijos(int hijos) {
      this.hijos = hijos;
   }

   // Una buena practica puede es crear un metodo toString
   public String toString() {
      return "Persona | nombre" + this.nombre +
            ", apellido: " + this.apellido +
            ", estadoCivil: " + this.estadoCivil +
            ", hijos: " + this.hijos;
   }

   // Podemos generar esto automaticamente los getters and setters
   // right click > source action > generate getters and setters > eligir los
   // getters and setters
}
