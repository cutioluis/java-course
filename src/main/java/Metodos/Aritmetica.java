package Metodos;

public class Aritmetica {
   // Atributos de nuestra clase
   int a;
   int b;

   // Metodos
   public void sumar() {
      System.out.println("Resultado Metodo: " + (a + b));
   }

   public int sumarReturn() {
      return a + b;
   }

   public int sumarWithParams(int rg1, int rg2) {
      a  = rg1;
      a = rg2;
      return  rg1  + rg2;
   }

   // This

}
