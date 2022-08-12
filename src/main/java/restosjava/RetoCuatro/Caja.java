package restosjava.RetoCuatro;

public class Caja {
   // Atributos
   int alto;
   int ancho;
   int profundidad;

   // Constructores
   public Caja() {
      System.out.println("Constructor iniciado");
   }

   public int getVolumenCaja() {
      return ancho * alto * profundidad;
   }

   public Caja(int alto, int ancho, int profundidad) {
      this.alto = alto;
      this.ancho = ancho;
      this.profundidad = profundidad;

      System.out.println("Ejecuta argumentos");
   }

}
