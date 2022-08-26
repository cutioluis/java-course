package clasesabastractas;

public class Rectangulo extends FiguraGeometrica {

   public Rectangulo(String tipoFigura) {
      super(tipoFigura);
   }

   // Es como la sobreescritura de los metodos
   //! PERO NO ESTAMOS SOBRESCRIBIENDO EL METODO SOLO ESTAMOS IMPLEMENTANDO
   @Override
   public void paint() {
      System.out.println("Vas a imprimir:" + this.getClass().getCanonicalName());
   }
}
