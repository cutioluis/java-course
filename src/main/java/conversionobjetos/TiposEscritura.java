package conversionobjetos;

public enum TiposEscritura {
   CLASICA("Escrcitura clasica"),
   MODERNA("Escritura digital");

   private String descripcion;
   TiposEscritura(String descripcion) {
      this.descripcion = descripcion;
   }

   public String getDescripcion() {
      return this.descripcion;
   }
   
}
