package Metodos;

public class PruebaAritmetica {
   public static void main(String[] args) {
      Aritmetica aritmetica = new Aritmetica();
      aritmetica.a = 3;
      aritmetica.b = 4;
      aritmetica.sumar(); 

      int resultado = aritmetica.sumarReturn();
      System.out.println(resultado);

      int res = aritmetica.sumarWithParams(1, 2);
      System.out.println(res);
   }
}
