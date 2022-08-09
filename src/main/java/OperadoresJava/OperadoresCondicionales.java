package OperadoresJava;

public class OperadoresCondicionales {
   public static void main(String[] args) {
      // Operadores condicionales: &&, ||

      boolean feriado = true;
      boolean vacaciones = false;

      // El if siempre da true if(true)
      // || OR
      // || es como la ley de signos del colegio
      // Si feriado o vacaciones es true bota ese mensaje de
      // Si no es true bota ese otro mensaje

      if (feriado || vacaciones) { // true
         System.out.println("Hoy no asistes al trabajo");
      } else {
         System.out.println("Tienes que ir al trabajo");
      }

      int rango = 5;
      int rangoMaximo = 30;
      int rangoMinimo = 0;

      boolean res = rango <= rangoMaximo && rango >= rangoMinimo;
      System.out.println("You are: " + res);

   }

}
