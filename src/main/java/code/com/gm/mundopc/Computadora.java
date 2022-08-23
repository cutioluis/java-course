package code.com.gm.mundopc;

public class Computadora {
   private int idComputer;
   private static int counterComputadora;
   private String nombre;
   private Monitor monitor;
   private Teclado teclado;
   private Mouse mouse;

   public Computadora() {
      System.out.println("Computadora specs");
   }

   public Computadora(String nombre, Monitor monitor, Teclado teclado, Mouse mouse) {
      this.idComputer = Computadora.counterComputadora++;
      this.monitor = monitor;
      this.mouse = mouse;
      this.teclado = teclado;
      this.nombre = nombre;
   }

   public int getIdComputer() {
      return idComputer;
   }

   public static int getCounterComputadora() {
      return counterComputadora;
   }

   public static void setCounterComputadora(int counterComputadora) {
      Computadora.counterComputadora = counterComputadora;
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public Monitor getMonitor() {
      return monitor;
   }

   public void setMonitor(Monitor monitor) {
      this.monitor = monitor;
   }

   public Teclado getTeclado() {
      return teclado;
   }

   public void setTeclado(Teclado teclado) {
      this.teclado = teclado;
   }

   public Mouse getMouse() {
      return mouse;
   }

   public void setMouse(Mouse mouse) {
      this.mouse = mouse;
   }

   @Override
   public String toString() {
      return "Computadora [idComputer=" + idComputer + ", monitor=" + monitor + ", mouse=" + mouse + ", nombre="
            + nombre + ", teclado=" + teclado + "]";
   }

}
