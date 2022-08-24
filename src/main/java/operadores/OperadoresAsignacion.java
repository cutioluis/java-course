package operadores;

public class OperadoresAsignacion {
   public static void main(String[] args) {
      int a = 3;
      int b = 3;
      System.out.println(a == b);

      a += 3; // a = a + 3
      System.out.println(a);

      a -= 3;// a = a - 3
      System.out.println(a);

      a *= 3; // a = a * 3
      System.out.println(a);

      a /= 3; // a = a / 3
      System.out.println(a);

      a &= 3; // a = a & 3
      System.out.println(a);
   }

}
