package foreach;

public class TestForEach {
   // El for each es un for pero mejorado
   public static void main(String[] args) {
      
      int edades[] = new int[3];
      edades[0] = 3;
      edades[1] = 5;
      edades[2] = 41;

/* 
      for(int i = 0; i < edades.length; i++) {
         System.out.println("Edades = " + edades[i]);
      }

*/
      // ! Perdemos el acceso al indice 
      for(int edad: edades) {
         System.out.println("Edades" + edad);
      }

   }   
}
