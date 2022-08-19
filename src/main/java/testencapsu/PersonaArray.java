package testencapsu;

import arraysjava.ArrayObject;

public class PersonaArray {
   public static void main(String[] args) {
      ArrayObject arrayObject[] = new ArrayObject[2];

      arrayObject[0] = new ArrayObject("Luis");
      arrayObject[1] = new ArrayObject("Alex");

      System.out.println("Array name: " + arrayObject[0]);
      System.out.println("Array name: " + arrayObject[1]);

      for (int i = 0; i < arrayObject.length; i++) {
         System.out.println("My array: " + arrayObject[i]);
      }

   }
}
