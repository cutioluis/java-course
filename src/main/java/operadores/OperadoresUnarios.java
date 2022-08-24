package operadores;

public class OperadoresUnarios {
   public static void main(String[] args) {
      // +, - = Ley de signos
      // ++, -- = Increamenta el agua en 10
      // - ! Invierte el valor booleano

      // lo pone en negativo
      int a = 4;
      System.out.println(-a);
      int b = 4;

      // incrementa en 1 a la variable b antes de la operacion de a + b
      System.out.println("a + b: " + (a + ++b)); // 9
      System.out.println(b);

      // incrementa en 1 a la variable b despues de la operacion de a + b
      System.out.println("a + b: " + (a + b++)); // 8
      System.out.println(b); // 6

      // Operador de negacion (boolean) niega la expression y la transforma a lo contrario
      boolean c = true; // false
      System.out.println("Boolean: "  + !c);

   }
}
