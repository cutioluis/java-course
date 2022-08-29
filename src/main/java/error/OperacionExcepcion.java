package error;

// La clase padre es Exception es la clase padre pero la su clase padre es THRAWABlE pero la mayoria herenda de EXCEPTION
// Cuando heredamos de Exception es CheclException
public class OperacionExcepcion extends Exception {
   public OperacionExcepcion(String mensaje ) {
      super(mensaje);
   }
}
