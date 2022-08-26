package testencapsu;

import clasesabastractas.FiguraGeometrica;
import clasesabastractas.Rectangulo;

public class ClasesAbstractas {
   public static void main(String[] args) {
      /*
        Esto no se puede crear porque es una clase abstract solo se puede crear a
        partir de las clases hijas
       */
      // FiguraGeometrica figura = new FiguraGeometrica("String");

      //! Tenemos que crearla de la clase hija no le padre
      //* Aqui aplicamos varios conceptos como el de DOWNCASTING  */
      // Convertimos una clase padre a hija
      FiguraGeometrica figura = new Rectangulo("S");
      figura.paint();
   }
}
