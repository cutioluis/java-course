package SentenciasControlJava;

public class SentenciaSwitch {
   public static void main(String[] args) {

      int n = 2;

      switch (n) // expresion
      {
         case 1:
            System.out.println("Numero 1");
            break;

         case 2:
            System.out.println("Numero 2");
            break;

         case 3:
            System.out.println("Numero 3");
            break;
      }

      int day = 5;
      String dayString;

      switch (day) {
         case 1:
            dayString = "Monday";
            break;

         case 2:
            dayString = "Tusday";
            break;

         case 3:
            dayString = "Wednesday";
            break;
         case 4:
            dayString = "Thursday";
            break;
         case 5:
            dayString = "Friday";
            break;
      }

   }

}
