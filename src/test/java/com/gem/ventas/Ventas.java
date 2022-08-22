package com.gem.ventas;

public class Ventas {
   public static void main(String[] args) {
      Producto producto = new Producto("Arroz", 50.12);
      System.out.println(producto);

      Orden orden = new Orden();
      orden.agregar(producto);
      orden.mostrar();

      Orden orden1 = new Orden();
      orden1.mostrar();

      
   }
}
