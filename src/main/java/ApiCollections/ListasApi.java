package ApiCollections;

import java.util.*;

public class ListasApi {
   public static void main(String[] args) {

      /*
       * Las listas son casi iguales que los Arrays sollo que las listas no tenemos
       * que definir su largo
       */
      List<String> listas = new ArrayList<>();
      listas.add("Ecuador");
      listas.add("Peru");
      listas.add("Venezuela");
      /*
       * for (Object lista : listas) {
       * System.out.println("Lista: " + lista);
       * }
       */

      // * Con Lamdas
      listas.forEach(lista -> {
         System.out.println("Lista: " + lista);
      });

   }
}
