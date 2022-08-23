package com.gem.ventas;

public class Ventas {
   public static void main(String[] args) {
      Producto producto = new Producto("Arroz", 50.12);
      System.out.println(producto);

      Producto producto1 = new Producto("Papas", 8.0);
      System.out.println(producto1);

      
      System.out.println(producto1);
      Producto producto2 = new Producto("Lechuga", 10.0);


      Orden orden = new Orden();
      orden.agregar(producto);
      orden.agregar(producto2);
      orden.mostrar();


      Orden orden1 = new Orden();
      orden1.mostrar();

   }
}
