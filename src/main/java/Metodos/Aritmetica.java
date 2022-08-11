package Metodos;

public class Aritmetica {
   // Atributos de nuestra clase
   int a;
   int b;

   // Constructor Vacio
   public Aritmetica() {
      // Este es nuestro constructor
      // Sabemos que se un constructor por que se llama igual que la CLASE
      // Java lo inicia por default asi que no es necesario que nosotros lo creemos
      System.out.println("Aqui se inicia el constructuor");
   }

   // Constructor com parametros
   public Aritmetica(int a, int b) {
      // con la palabra this accedemos a los atributos de la clase
      this.a = a;
      this.b = b;
      // a = a;
      // a = b;
      // Si no agregamos la palabra this estamos accedemos a los parametros de nuestro constructor
      
      System.out.println("Ejecutando constructor con argumentos");
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
   // Con la palabra this podemos acceder a los atributos de nuestra clase
   // No es necesario pero en algunos casos en necesario
   // this.name

}
