package ApiCollections;

import java.util.*;

public class SetList {
   public static void main(String[] args) {
      // Set es la misma basura que list pero no tiene orden y no se puede repetir
      // elementos
      Set setList = new HashSet();
      setList.add("Monday");
      setList.add("XIowe");
      setList.add("Friday");
      setList.add("Thursday");
      setList.add("Thursday");


      setList.forEach(list -> {
         System.out.println("Listas: " + list);
      });

   }
}
