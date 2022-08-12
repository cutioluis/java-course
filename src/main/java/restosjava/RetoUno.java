package restosjava;

import java.util.Scanner;

public class RetoUno {

   /*
    * nombre (String)
    * id (int)
    * precio (double)
    * envioGratuito (boolean)
    */

   public static void main(String[] args) {

      Scanner i = new Scanner(System.in);

      System.out.println("Cual es tu nombre");
      String name = i.nextLine();

      System.out.println("Igresa tu ID");
      int id = i.nextInt();

      System.out.println("Ingresa el precio");
      Long precio = i.nextLong();

      System.out.println("Deseas el envio Gratuito");
      boolean envioGratuito = i.nextBoolean();

      System.out.println("Tu factura quedaria asi \n" + name + "\n" + id + "\n" + precio + "\n" + envioGratuito + "\n");

   }

}
