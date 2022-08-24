package code.mundopc;

import code.com.gm.mundopc.Computadora;
import code.com.gm.mundopc.DipositivosEntrada;
import code.com.gm.mundopc.Monitor;
import code.com.gm.mundopc.Mouse;
import code.com.gm.mundopc.Orden;
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

      Teclado teclado1 = new Teclado("Keyboard");

      Mouse mouse = new Mouse("Mouse ", "USB", "red", 12);

      Mouse mouse1 = new Mouse("Relogic ", "Inalambric", "Black", 89);

      Monitor monitor = new Monitor("Quasad", 144);

      Monitor monitor1 = new Monitor("Relogic", 244);

      System.out.println("-------------------------------------------------------------------");

      // Computadora
      Computadora pc = new Computadora("PC Ryzen 7 3090", monitor, teclado, mouse);
      Computadora pc1 = new Computadora("PC Nvidia 3080", monitor1, teclado1, mouse1);

      // Orden
      Orden newOrden = new Orden();
      newOrden.agregarComputador(pc);
      newOrden.mostrarOrden();

      
      System.out.println("-------------------------------------------------------------------");

      Orden newOrden1 = new Orden();
      newOrden1.agregarComputador(pc1);
      newOrden1.mostrarOrden();
   }
}
