package code.com.gm.mundopc;

public class Monitor {
   private int idMonitor;
   private String marca;
   private double hz;
   private static int counterMonitor;

   public Monitor() {
      System.out.println("Monitor Specs");
   }

   public Monitor(String marca, double hz) {
      this.idMonitor = Monitor.counterMonitor++;
      this.hz = hz;
      this.marca = marca;
   }

   public int getIdMonitor() {
      return idMonitor;
   }

   public void setIdMonitor(int idMonitor) {
      this.idMonitor = idMonitor;
   }

   public String getMarca() {
      return marca;
   }

   public void setMarca(String marca) {
      this.marca = marca;
   }

   public double gethz() {
      return hz;
   }

   public void sethz(double hz) {
      this.hz = hz;
   }

   public static int getCounterMonitor() {
      return counterMonitor;
   }

   @Override
   public String toString() {
      return "Monitor [idMonitor=" + idMonitor + ", marca=" + marca + ", hz=" + hz + "]";
   }
}
