package exceptions;

public class Division {
   public static void main(String[] args) {

      int resultado = 0;

      try {
         resultado = 10 / 0;
      } catch (Exception e) {
         System.out.println("A OCURRIDO UN ERROR");
         e.printStackTrace(System.out); // ! Va imprimir la pila de excepciones que tengamos ya que una excepcion pued ocasionar otra
      }
      System.out.println(resultado);
   }
}
