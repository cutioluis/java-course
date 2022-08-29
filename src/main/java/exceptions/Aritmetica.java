package exceptions;

import error.OperacionExcepcion;

public class Aritmetica {
   
   public static int division(int a, int b)
      // Este THROWS significa que posiblemente este metodo puede tener un error
      throws OperacionExcepcion {
      if (b == 0) {
         throw new OperacionExcepcion("Division entre cero");
      }
      return a / b;
   }
}
