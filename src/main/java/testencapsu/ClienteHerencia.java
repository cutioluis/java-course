package testencapsu;

import java.time.LocalDate;
import herencia.Persona;

public class ClienteHerencia extends Persona {

   // Atributos de nuestra clase
   private int id;
   private static int contadorCliente;
   private LocalDate fechaEntrada;
   private boolean vip;

   /* Constructor */
   public ClienteHerencia() {
      System.out.println("Constructor vacio");
   }

   public ClienteHerencia(String name, String direccion, char genero, int edad, boolean vip, LocalDate fechaEntrada) {
      super(name, genero, edad, direccion);
      this.fechaEntrada = fechaEntrada;
      this.id = ClienteHerencia.contadorCliente++;
      this.vip = vip;
   }

   /* Metodos */
   public int getId() {
      return id;
   }

   public void setId(int id) {
      this.id = id;
   }

   public static void setContadorCliente(int contadorCliente) {
      ClienteHerencia.contadorCliente = contadorCliente;
   }

   public LocalDate getfechaEntrada() {
      return fechaEntrada;
   }

   public void setfechaEntrada(LocalDate fechaEntrada) {
      this.fechaEntrada = fechaEntrada;
   }

   public boolean isVip() {
      if (vip) {
         System.out.println("U are vip");
      } else {
         System.out.println("u are not vip");
      }
      return vip;
   }

   public void setVip(boolean vip) {
      this.vip = vip;
   }

   @Override
   public String toString() {
      return "ClienteHerencia [fechaEntrada=" + fechaEntrada + ", id=" + id + ", vip=" + vip + ", " + super.toString()
            + "]";
   }

}
