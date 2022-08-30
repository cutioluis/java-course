package ApiCollections;

import java.util.*;

public class MapJava {
   public static void main(String[] args) {
      Map<Integer, String> miMapa = new HashMap<Integer, String>();
      miMapa.put(12, "Luis");
      miMapa.put(13, "Alex");

      String value = miMapa.get(13);
      System.out.println(value);

   }
}
