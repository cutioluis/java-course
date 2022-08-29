package error;

// La clase padre es Exception es la clase padre pero la su clase padre es THRAWABlE pero la mayoria herenda de EXCEPTION
// Cuando heredamos de Exception es CheclException

//* Usando RuntimeException no se necesita reportar haciendo el try, catch */
/* Los mas recomendable es usar el RuntimeException POR QUE DEJA CODIGO MAS LIMPIO */
/*
 ? Pero si necesitas hacer controlar la exception mas a profundidad usa Exception
 */
public class OperacionExcepcion extends RuntimeException {
   public OperacionExcepcion(String mensaje) {
      super(mensaje);
   }
}
