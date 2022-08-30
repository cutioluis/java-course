package testencapsu;

import generics.GenericT;

public class GenericsTest {
   public static void main(String[] args) {

      // Puede crear el tipo que deseamos recibe entero y transforma a Integer
      GenericT<Integer> genericItem = new GenericT<>(12);
      genericItem.obtenerItem();

      GenericT<String> genericItem2 = new GenericT<>("Luis");
      genericItem2.obtenerItem();
   }
}
