package exceptions;

public class Division {
   public static void main(String[] args) {

      int resultado = 0;

      try {
         resultado = Aritmetica.division(10, 10);
      } catch (Exception e) {
         System.out.println("A OCURRIDO UN ERROR");
         /*
          * !Va imprimir la pila de excepciones que tengamos ya que una excepcion pued
          * ocasionar otra
          */
         e.printStackTrace(System.out);
         e.getMessage();
      }
      System.out.println(resultado);
   }
}
