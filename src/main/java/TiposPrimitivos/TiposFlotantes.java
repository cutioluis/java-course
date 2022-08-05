package TiposPrimitivos;

public class TiposFlotantes {
   public static void main(String args[]) {
   
      // FLOTANTES: float 32 = bits; double = 64bits;
      float numeroFloat = 12.4f;
      System.out.println(numeroFloat);
      System.out.println("Valor minimo" + Float.MIN_VALUE);
      System.out.println("Valor maximo" + Float.MAX_VALUE);

      //  los enteros tambien podemos poner en el double
      double numeroDouble = 12.321321;
      System.out.println(numeroDouble);
      System.out.println("Valor minimo" + Double.MIN_VALUE);
      System.out.println("Valor maximo" + Double.MAX_VALUE);
   }
}
