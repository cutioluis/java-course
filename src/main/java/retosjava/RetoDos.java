package retosjava;

import java.util.Scanner;

public class RetoDos {
   public static void main(String[] args) {
   
      // Calcular el area y el perimetro de un Rectangulo
      // Alto, Ancho
      // f(area) = h*a
      // f(perimetro) = (h+a)*2

      Scanner i = new Scanner(System.in);

      System.out.println("Deseas sacar el area y el perimetro de un Rectangulo?");
      boolean enter = i.nextBoolean();

      if (enter) {
         System.out.println("Empecemos con el area de un Rectangulo");

         System.out.println("Cual es la altura de tu Rectangulo?");
         int altura = i.nextInt();
         
         System.out.println("Cual es el largo de tu Rectangulo? ");
         int largo = i.nextInt();

         System.out.println(
               "El area de tu rectangulo es: " + altura * largo
         );
         System.out.println("-------------------------------------------------------------");
         System.out.println("El perimetro de rectangulo es: " + (altura + largo) * 2);

      } else {
         System.out.println("A la orden! Nos vemos");
      }

   }
}
