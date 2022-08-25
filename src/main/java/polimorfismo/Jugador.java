package polimorfismo;

public class Jugador extends Persona {
   private int cedula;

   public Jugador(String nombre, double sueldo, int cedula) {
      super(nombre, sueldo);
      this.cedula = cedula;
   }

   @Override
   public String obtenerDetalles() {
      return super.obtenerDetalles() + " Cedula: " + this.cedula;
   }
}
