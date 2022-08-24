package code.com.gm.mundopc;

import java.util.Arrays;

public class Orden {
   private int idOrden;
   private Computadora computadoras[];
   private static int contadorOrdenes;
   private int contadorComputadoras;
   private static final int maxComputadoras = 10;

   // Orden vacia
   public Orden() {
      this.idOrden = Orden.contadorOrdenes++;
      this.computadoras = new Computadora[maxComputadoras];
   }

   // metodo agregar computadora
   public void agregarComputador(Computadora computadora) {
      if (this.contadorComputadoras < Orden.maxComputadoras) {
         this.computadoras[this.contadorComputadoras++] = computadora;
      } else {
         System.out.println("Limite maximo de 10");
      }
   }

   // metodo mostrar orden: void
   public void mostrarOrden() {
      System.out.println("Orden Numero: " + this.idOrden );
      for (int i = 0; i < this.contadorComputadoras; i++) {
         System.out.println(this.computadoras[i]);
      }
   }

   public int getIdOrden() {
      return idOrden;
   }

   public void setIdOrden(int idOrden) {
      this.idOrden = idOrden;
   }

   public Computadora[] getcomputadoras() {
      return computadoras;
   }

   public void setComputadoras(Computadora[] computadoras) {
      this.computadoras = computadoras;
   }

   public static int getContadorOrdenes() {
      return contadorOrdenes;
   }

   public int getContadorComputadoras() {
      return contadorComputadoras;
   }

   public void setContadorComputadoras(int contadorComputadoras) {
      this.contadorComputadoras = contadorComputadoras;
   }

   public static int getMaxcomputadoras() {
      return maxComputadoras;
   }

   @Override
   public String toString() {
      return "Orden [computadoras=" + Arrays.toString(computadoras) + ", contadorComputadoras=" + contadorComputadoras
            + ", idOrden=" + idOrden + "]";
   }

}
