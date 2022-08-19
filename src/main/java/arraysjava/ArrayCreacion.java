package arraysjava;

public class ArrayCreacion {
   public static void main(String[] args) {

      // * Creacion de Arrays
      // Para crear un array
      // 1.tipo de dato
      // 2.nombre de la variaablecon[]
      // 3. Creamos new int[Aqui definimos el numero de nuestro array]
      // Array hereda desde object la calse padre

      String myArray2[] = new String[3];
      System.out.println(myArray2);

      int myArray[] = new int[3];
      // Se imprime la direccion de memoria
      System.out.println(myArray);

      // * Modificacion de Arrays
      // Aceddemos a la posicion del Array en este caos la posicion 0 y le asignamos
      // un valor
      myArray[0] = 18;
      myArray[1] = 19;
      myArray[2] = 20;
      // Imprimimos el numero que modificamos accediendo al valor como el
      // anteriormente
      System.out.println("Numero 0: " + myArray[0]);

      // * Iteracion de un Array
      // si i < myArray.deSuLongitud; ve incrementando den 1
      for (int i = 0; i < myArray.length; i++) {
         System.out.println("myArray Items: " + i + " " + myArray[i]);
      }

      // * Sintaxis resumida de arrays
      // Tambien podemos crear arrays sin definir el n de elementps que tendra asi
      String frutas[] = { "Manzana", "Pera", "Papaya" };
      for (int i = 0; i < frutas.length; i++) {
         System.out.println("frutas: " + i + ", " + frutas[i]);
      }

   }
}
