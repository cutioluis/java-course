package code.com.gm.mundopc;

public class DipositivosEntrada {

   // * Atributos
   private String marca;
   private String tipoDeEntrada;

   // * Constructor

   public DipositivosEntrada() {
      // ! Necesita un constructor vacio ?
      System.out.println("Dispositivos de entrada");
   }

   public DipositivosEntrada(String marca) {
      this.marca = marca;
   }

   public DipositivosEntrada(String tipoDeEntrada, String marca) {
      this.tipoDeEntrada = tipoDeEntrada;
      this.marca = marca;
   }

   // *Getters and Setters
   public String getTipoDeEntrada() {
      return tipoDeEntrada;
   }

   public void setTipoDeEntrada(String tipoDeEntrada) {
      this.tipoDeEntrada = tipoDeEntrada;
   }

   public String getMarca() {
      return marca;
   }

   public void setMarca(String marca) {
      this.marca = marca;
   }

   @Override
   public String toString() {
      return "DipositivosEntrada: [marca=" + marca + ", tipoDeEntrada=" + tipoDeEntrada + "]";
   }

}
