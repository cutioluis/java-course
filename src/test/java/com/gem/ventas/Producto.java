package com.gem.ventas;

public class Producto {

   // * Empiezo a agregar nuestros atributos de nuestro producto

   // id producto
   public int idProducto;

   // counter para el producto
   public static int counterProduct;

   // nombre producto
   public String nameProducto;

   // precio producto
   public double priceProducto;

   // * Constructores

   public Producto() {
      System.out.println("Este constructor es el vacio");
   }

   public Producto(String nameProducto, double priceProducto) {
      this.idProducto = Producto.counterProduct++;
      this.nameProducto = nameProducto;
      this.priceProducto = priceProducto;
   }

   // * Getters and setters


   @Override
   public String toString() {
      return "Producto [idProducto=" + idProducto + ", nameProducto=" + nameProducto + ", priceProducto="
            + priceProducto + "]";
   }

   public int getIdProducto() {
      return idProducto;
   }

   public void setIdProducto(int idProducto) {
      this.idProducto = idProducto;
   }

   public static int getCounterProduct() {
      return counterProduct;
   }

   public static void setCounterProduct(int counterProduct) {
      Producto.counterProduct = counterProduct;
   }

   public String getNameProducto() {
      return nameProducto;
   }

   public void setNameProducto(String nameProducto) {
      this.nameProducto = nameProducto;
   }

   public double getPriceProducto() {
      return priceProducto;
   }

   public void setPriceProducto(double priceProducto) {
      this.priceProducto = priceProducto;
   }

}
