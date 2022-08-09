package OperadoresJava;

public class OperadorTernario {
   public static void main(String[] args) {
      // OperadorTernario: ? :

      // Es como un if pero mas corto
      // No es recomendable usar si la condicion que se va hacer es demasiada larga
      int a = 3;
      int b = 3;

      System.out.println(
            a > b ? "Es mayor" : "Es menor");

      System.out.println(
            (a % 2 == 0) ? "Es par" : "No es par");

   }
}
