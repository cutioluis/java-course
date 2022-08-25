package testencapsu;

import instanceofjava.Bloque;
import instanceofjava.BloqueDiamond;

public class InstanceOf {
   public static void main(String[] args) {
      
      Bloque bloque = new Bloque(5, 5);
      mostrarTipo(bloque);

      bloque = new BloqueDiamond(5, 5, "Mena de Diamante");
      mostrarTipo(bloque);
   }

   // InstanceOf nos permite ver de que tipo es
   public static void mostrarTipo(Bloque bloque) {
      if (bloque instanceof BloqueDiamond) {
         System.out.println("Si es de tipo EMPLEADO");
      } else if (bloque instanceof Bloque) {
         System.out.println("S es de tipo BloqueDiamond");
      } else if (bloque instanceof Object) {
         System.out.println("Es de tipo Object");
      }

   }
}
