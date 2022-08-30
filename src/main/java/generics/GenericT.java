package generics;
/*
 * Supongamos que tenemos un basuraro donde la gente bota cualquier desecho
 * eso es posible pero el basureo solo es de papel y la gente bota plasticos
 * desechos organicos
 * con las CLASES GENERICAS podemos hacer que solo exista un basurero de solo
 * papel y nada mas
 */

public class GenericT<T> /* Desigmos que va a ser generico */ {

   // no sabemos que tipo es
   private T objeto;

   public GenericT(T objeto) {
      this.objeto = objeto;
   }

   // Obtiene la clase y el nombre
   public void obtenerItem() {
      System.out.println("El tipo es: " + objeto.getClass().getSimpleName());
   }
}
