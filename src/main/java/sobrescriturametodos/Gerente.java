package sobrescriturametodos;

// vamos extender ed Empleado y agregar un nuevo atributo
public class Gerente extends Empleado {
   private String departamento;

   public Gerente(String nombre, double sueldo, String departamento) {
      // para inicializar esos atributos que estan dentro de Empleado la clase padre
      // Usamos super para llamar a la clase padre
      //! Recuerda que debe ir primero super despues lo que vamos a inicializar
      super(nombre, sueldo);
      this.departamento = departamento;
   }

   // Decimos que vaoms a sobrescribir con Override
   @Override
   public String obtenerDetalles() {
      // Podemos acceder a super de la calse padre obtener el metodo
      // Despues concatenamos el nuevo valor

      // Si accedemos al obtenerDetalles() nos manda al metodo que sobrescribimos en la clase hija
      return super.obtenerDetalles() + this.departamento;
   }
}
