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

      // Operadores Relacionales: > <, >= <= <,
      int e = 4;
      int f = 3;

      // Mira si es mayor que e y f, < verifica si es menor
      System.out.println("e es mayor que f: " + (e > f)); // true

      // Verifica si es mayor o igual
      int g = 4;
      int h = 4;
      System.out.println(g >= h);

   }
}
