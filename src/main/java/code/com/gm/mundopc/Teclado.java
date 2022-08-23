package code.com.gm.mundopc;

public class Teclado extends DipositivosEntrada {
   private int idTeclado;
   private static int counterTeclado;

   public Teclado(String marca) {
      super();
      this.idTeclado = Teclado.counterTeclado++;
   }

   public int getIdTeclado() {
      return idTeclado;
   }

   public static int getCounterTeclado() {
      return counterTeclado;

   }

   public static void setCounterTeclado(int counterTeclado) {
      Teclado.counterTeclado = counterTeclado;
   }

   @Override
   public String toString() {
      return "Teclado: [idTeclado=" + idTeclado + " " + this.getMarca() + " " + this.getTipoDeEntrada() + "]";
   }
}
