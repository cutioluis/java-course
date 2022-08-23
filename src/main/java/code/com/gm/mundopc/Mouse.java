package code.com.gm.mundopc;

public class Mouse extends DipositivosEntrada {
   private int idMouse;
   private static int counterMouse;
   private String color;
   private double precio;

   public Mouse(String marca, String tipoDeEntrada, String color, double precio) {

      // ! recibe un constructor ???
      super(marca, tipoDeEntrada);
      this.color = color;
      this.precio = precio;
      this.idMouse = Mouse.counterMouse++;
   }

   public String getColor() {
      return color;
   }

   public void setColor(String color) {
      this.color = color;
   }

   public int getIdMouse() {
      return idMouse;
   }

   public static int getCounterMouse() {
      return counterMouse;
   }

   public static void setCounterMouse(int counterMouse) {
      Mouse.counterMouse = counterMouse;
   }

   public double getPrecio() {
      return precio;
   }

   public void setPrecio(double precio) {
      this.precio = precio;
   }

   @Override
   public String toString() {
      return "Mouse [color=" + color + ", idMouse=" + idMouse + ", precio=" + precio + "]";
   }
}
