package OperadoresJava;

public class OperadoresIgualdadRelacionales {
   public static void main(String[] args) {
      // Operadores Igualdad: == !=
      int a = 2;
      int b = 2;

      System.out.println("es igual de, a = b  " + (a == b)); // true
      System.out.println(" es diferente de, a != b " + (a != b)); // false

      String c = "Java";
      String d = "Java";

      // Este metodo equals compara las cadenas para ver si son diferentes
      System.out.println("Son iguales?,   Java + Java " + c.equals(d)); // true
   }
}
