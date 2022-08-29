package testencapsu;

import interfaces.*;

public class Interfaces {
   public static void main(String[] args) {
      // Crearemos un tipo IAccesoDatos PERO NO PODEMOS CREAR POR QUE ES ABSTRACTA
      // Necesitamos crear de sus hijos

      IAccesoDatos datos = new ImplementsOracle();
      // datos.listar();
      print(datos);

      // *Aplicamos conceptos de herencia y polimorfismo */
      
      datos = new ImplementsMySql();
      // datos.listar();
      print(datos);
   }

   public static void print(IAccesoDatos datos) {
      datos.listar();
   }

}
