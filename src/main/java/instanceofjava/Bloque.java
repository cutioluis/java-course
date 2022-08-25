package instanceofjava;

public class Bloque {
   private int height;
   private int width;

   public Bloque(int height, int width) {
      this.height = height;
      this.width = width;
   }

   public String obtenerDetalles() {
      return "Altura: " + height + "," + "Ancho: " + width;
   }

   public int getHeight() {
      return this.height;
   }

   public void setHeight(int height) {
      this.height = height;
   }

   public int getWidth() {
      return this.width;
   }

   public void setWidth(int width) {
      this.width = width;
   }

}
