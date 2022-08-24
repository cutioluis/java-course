package parametros;

public class VariablesParametros {

   // * Argumentos Variables
   public static void main(String[] args) {
      agregarArgumentos(1, 3, 4, 5);
      agregarArgumentos(1, 3);
   }

   // Se declara con tres puntos
   // Se como un array indefinido
   // Internamente se trata como un array
   // ! Siempre tenemos que mandar estos parametros al final si tenemos mas de un argumento
   // ? A diferencia de array no tenemos que pasrle los elementos que estamos pasando

   public static void agregarArgumentos(int... numeros) {
      for (int i = 0; i < numeros.length; i++) {
         System.out.println("Varags: " + numeros[i]);
      }
   }
}
