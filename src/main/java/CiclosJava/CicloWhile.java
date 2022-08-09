package CiclosJava;

public class CicloWhile {
   public static void main(String[] args) {

      // Ciclo while: while
      // While > condicion si se cumple ejecuta si no fin

      int n = 5;

      // mientras 5 < 10 haz esto
      while (n < 10) {
         System.out.println("Contador con While: " + n++);
      }

      // Do While
      // Pero ejecuta al menoz una vez la condicion
      // Do ejecuta codigo a repetir > condicion si se cumple ejecuta si no fin
      int n2 = 11;

      do {
         System.out.println("Contador con Do While" + n2);
         n2++;
      } while (n2 < 10);

   }
}
