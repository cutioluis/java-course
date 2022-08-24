package unautoboxing;

public class AutoBoxing {
   /*
    * Normalmente tenemos los tipos de datos primitivos que tienen sus calses
    * envolventes
    * int - Integer
    * double - Double
    * float - Float
    * boolean - Boolean
    * byte - Byte
    * char - Character
    * short - Short
    */

   public static void main(String[] args) {

      // Sus clases envolvente tienes algunos metodos adicionales que el tipo
      // primitivo
      Integer b = 12; // AutoBoxing = tipo primitivo a tipo object
      System.out.println(b);
      System.out.println("Variable a Double" + b.doubleValue());

      int a = b; // Unboxing = sacando del tipo object y lo pasamos a tipo primitivo
      System.out.println(a);
   }
}
