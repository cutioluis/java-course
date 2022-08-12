package testencapsu;

import herencia.Persona;

public class EmpleadoHerencia extends Persona {
   // Con la palabra extends va a "heredar" los metedos que tenemos dentro de
   // persona

   private int idEmpleado;
   private double sueldo;
   private static int contadorEmpleado;

   public EmpleadoHerencia(String nombre, double sueldo) {
      super(nombre);
      this.idEmpleado = EmpleadoHerencia.contadorEmpleado++;
      this.sueldo = sueldo;
   }

   public int getIdEmpleado() {
      // Recuerda agregar la palabra reservada this es buena practica
      return this.idEmpleado;
   }

   public double getSueldo() {
      return this.sueldo;
   }

   public void setSueldo(double sueldo) {
      this.sueldo = sueldo;
   }

   @Override
   public String toString() {
      return "EmpleadoHerencia [idEmpleado=" + this.idEmpleado + ", nombre: " + this.nombre + ", sueldo=" + this.sueldo + "]";
   }

}
