package instanceofjava;

public class BloqueDiamond extends Bloque {
   private String name;

   public BloqueDiamond(int width, int height, String name) {
      super(width, height);
      this.name = name;
   }

   @Override
   public String obtenerDetalles() {
      return "Nombre: " + this.name + "," + super.obtenerDetalles();
   }
}
   