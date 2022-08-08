package TiposPrimitivosJava;

public class TiposEnteros {
   public static void main(String[] args) {
      // ENTEROS: byte = 8bits, short = 16bits, int = 32bits, long = 64bits
      byte numeroByte = 54;
      System.out.println(numeroByte);

      // Podemos ver el tupo el alcanze maximo que cada tipo de dato
      System.out.println("alcance maximo" + Byte.MAX_VALUE);
      System.out.println("alcance minimo" + Byte.MIN_VALUE);

      short numeroShort = 13;
      System.out.println(numeroShort);
      System.out.println("alcance maximo" + Short.MAX_VALUE);
      System.out.println("alcance minimo" + Short.MIN_VALUE);

      int numeroInt = 4214;
      System.out.println(numeroInt);
      System.out.println("alcance maximo" + Integer.MAX_VALUE);
      System.out.println("alcance maximo" + Integer.MIN_VALUE);

      // Podemos convertir el tipo de dato asi
      long numeroLong = (long) 4213213;
      System.out.println(numeroLong);
      System.out.println("alcance maximo" + Long.MAX_VALUE);
      System.out.println("alcance maximo" + Long.MIN_VALUE);

      // solo puede alacenar un caracter de acuerdo al standar de unicode
      char onlyOne = '\u0021';
      System.out.println(onlyOne);

      // Tipo boolean solo puede tener true o false
      boolean varBoolean = false;
      System.out.println(varBoolean);

      if (varBoolean) {
         System.out.println("Es verdadedor");
      } else {
         System.out.println("No es verdadedor");
      }
      

   }
}
