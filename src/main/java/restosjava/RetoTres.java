package restosjava;

import java.util.Scanner;

public class RetoTres {
   public static void main(String[] args) {
      Scanner i = new Scanner(System.in);

      System.out.println("Dame un numero");
      int a = i.nextInt();

      System.out.println("Dame otro numero");
      int b = i.nextInt();

      if (a > b) {
         System.out.println("Es mayor");
      } else {
         System.out.println("Es menor");
      }

   }
}
