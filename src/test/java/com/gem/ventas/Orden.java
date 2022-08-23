package com.gem.ventas;

public class Orden {

   // * Orden
    /*
    * - Se encarga de crear objetos Orden
    * - Administa los productos
    */

   public int idOrden;
   public Producto productos[];
   public static int contadorOrdenes;
   public int contadorProductos;
   private static final int MAX_PRODUCTOS = 10;

   public Orden() {
      // es el id
      this.idOrden = Orden.contadorOrdenes++;
      this.productos = new Producto[MAX_PRODUCTOS];

   }

   // agregar
   public void agregar(Producto producto) {
      if (this.contadorProductos < Orden.MAX_PRODUCTOS) {
         this.productos[this.contadorProductos++] = producto;
         // this.productos[2] = producto;
      } else {
         System.out.println("Se ha superado el maximo de productos");
      }
   }

   // total
   public double total() {
      double total = 0;
      for (int i = 0; i < contadorProductos; i++) {
         total += this.productos[i].getPriceProducto();
      }
      return total;
   }

   // mostrar
   public void mostrar() {
      System.out.println("Id Orden: " + this.idOrden);
      double totalOrden = this.total();
      System.out.println("Total de la Orden: $" + totalOrden);
      System.out.println("Productos de la Orden: ");
      for (int i = 0; i < this.contadorProductos; i++) {
         System.out.println(this.productos[i]);
      }
   }

}
