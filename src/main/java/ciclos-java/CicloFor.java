package CiclosJava;

public class CicloFor {
   public static void main(String[] args) {
      // Ciclo For

      for (int a = 0; a < 10; a++) {
         System.out.println("Contador: " + ++a);
      }

      for (int a = 0; a < 30; a++) {
         if (a % 2 == 0) {
            System.out.println("Es par " + a);
            // podemos romperlo poniendo break;
            // podemos contunuar con continue'
            continue;
         } else {
            System.out.println("No es par " + a);
         }
      }

   }
}
