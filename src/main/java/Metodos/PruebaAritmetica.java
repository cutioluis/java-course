package Metodos;

public class PruebaAritmetica {
   public static void main(String[] args) {
      System.out.println("Primer Constructor");
      System.out.println("------------------------------------------------");
      Aritmetica aritmetica = new Aritmetica();
      aritmetica.a = 3;
      aritmetica.b = 4;
      aritmetica.sumar(); 

      int resultado = aritmetica.sumarReturn();
      System.out.println(resultado);

      int res = aritmetica.sumarWithParams(1, 2);
      System.out.println(res);

      System.out.println("Segundo Constructor");
      System.out.println("-------------------------------------------");

      Aritmetica aritmetical = new Aritmetica(10, 5);
      System.out.println("Argumentos: " + aritmetical.a);
      System.out.println("Argumentos: " + aritmetical.b);
   }
}
