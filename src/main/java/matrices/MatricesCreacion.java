package matrices;

public class MatricesCreacion {

   public static void main(String[] args) {

      // * Matrices
      // * resources/matrices
      // Para la creacion de matrices vamos a verla como 2 arreglos

      int matriz[][] = new int[3][2];
      System.out.println(matriz);

      /*
       * {8, 2, 0},
       * {9, 4, 5},
       * {10, 5, 7}
       */

      // * Modificacion de matrices
      matriz[0][0] = 5;
      matriz[0][1] = 8;

      for (int ren = 0; ren < matriz.length; ++ren) {
         for (int col = 0; col < matriz[col].length; ++col) {
            System.out.println("Matriz: " + ren + "-" + col + ": " + matriz[ren][col]);
         }
      }

   }
}
