package TiposPrimitivos;

public class TiposPrimitivos {
   public static void main(String[] args) {
      // Parar entero: byte = 8bits, short = 16bits, int = 32bits, long = 64bits
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
      long numeroLong = (long)4213213;
      System.out.println(numeroLong);
      System.out.println("alcance maximo" + Long.MAX_VALUE);
      System.out.println("alcance maximo" + Long.MIN_VALUE);
   }
}
