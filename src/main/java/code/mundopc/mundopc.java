package code.mundopc;

import code.com.gm.mundopc.DipositivosEntrada;
import code.com.gm.mundopc.Monitor;
import code.com.gm.mundopc.Mouse;
import code.com.gm.mundopc.Teclado;

public class mundopc {
   public static void main(String[] args) {

      // Dispositivos de entrada
      DipositivosEntrada dispositovoEntrada = new DipositivosEntrada("Teclado", "MSI");
      System.out.println(dispositovoEntrada);

      DipositivosEntrada dispositovoEntrada1 = new DipositivosEntrada("Mouse", "Logitech");
      System.out.println(dispositovoEntrada1);

      // Teclado hereda desde dispositovoEntrada
      Teclado teclado = new Teclado("Keyboard Mechanic");
      System.out.println(teclado);

      Teclado teclado1 = new Teclado("Keyboard Mechanic");
      System.out.println(teclado1);

      Mouse mouse = new Mouse("Mouse ", "USB", "red", 12);
      System.out.println(mouse);

      Monitor monitor = new Monitor("Quasad", 144);
      System.out.println(monitor);
   
      Monitor monitor1 = new Monitor("Quasad", 144);
      System.out.println(monitor1);
   

   }
}
