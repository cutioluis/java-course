package conversionobjetos;

public class Escritor extends Persona {
   final TiposEscritura tipoEscritura;

   public Escritor(String nombre, int numero, TiposEscritura tipoEscritura) {
      super(nombre, numero);
      this.tipoEscritura = tipoEscritura;
   }

   @Override
   public String obtenerDetalles() {
      return "Escritura: " + this.tipoEscritura + super.obtenerDetalles();
   }


   public String sayHello() {
      return "HOLA SOY UN METODO SOLO EN LA CLASE ESCRITOR";
   }

   // metodo devuelve el tipo de escritura
   public TiposEscritura getTipoEscritura() {
      return this.tipoEscritura;
   }


}
