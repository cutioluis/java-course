package testencapsu;

import sobrescriturametodos.Gerente;

public class GerenteSobrescritura {
   public static void main(String[] args) {
      // Aqui vamos a hacer el test de sobrescritura
      Gerente gerente = new Gerente("Luis", 200, "Java Developer");
      gerente.obtenerDetalles();
   }  
}
