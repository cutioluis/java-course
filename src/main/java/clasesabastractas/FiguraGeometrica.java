package clasesabastractas;



// Aqui teneoms que definir que esto va a ser una clase //* ABSTRACTA */
public abstract class FiguraGeometrica {
   protected String tipoFigura;

   protected FiguraGeometrica(String tipoFigura) {
      this.tipoFigura = tipoFigura;
   }

   // Aqui vamos a agregar nuestro metodos abstract que no sabes que realmente van a hacer
   // No necesitamos agregar ninguna implementacion
   // No sabemos que va a dibujar y vamos a saber crearndo una clase hija
   public abstract void paint();
   
   public String getTipoFigura() {
      return this.tipoFigura;
   }

   public void setTipoFigura(String tipoFigura) {
      this.tipoFigura = tipoFigura;
   }

}