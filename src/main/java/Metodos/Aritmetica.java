package Metodos;

public class Aritmetica {
   // Atributos de nuestra clase
   int a;
   int b;

   public Aritmetica() {
      //Este es nuestro constructor
      // Sabemos que se un constructor por que se llama igual que la CLASE
      // Java lo inicia por default asi que no es necesario que nosotros lo creemos
      System.out.println("Aqui se inicia el constructuor");
   }
 
   // Metodos
   public void sumar() {
      System.out.println("Resultado Metodo: " + (a + b));
   }

   public int sumarReturn() {
      return a + b;
   }

   public int sumarWithParams(int rg1, int rg2) {
      a = rg1;
      a = rg2;
      return rg1 + rg2;
   }

   // This

}
