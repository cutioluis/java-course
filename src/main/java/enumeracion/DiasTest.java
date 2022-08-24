package enumeracion;

public class DiasTest {
   public static void main(String[] args) {
      mostrarDias(Dias.JUEVES);
   }

   public static void mostrarDias(Dias dias) {

      switch (dias) {
         case LUNES:
            System.out.println("Dia lunes");
            break;
         case MARTES:
            System.out.println("Dia martes");
            break;
         case MIERCOLES:
            System.out.println("Dia miercoles");
            break;
         case JUEVES:
            System.out.println("Dia jueves");
            break;
         case VIERNES:
            System.out.println("Dia viernes");
            break;
         case SABADO:
            System.out.println("Dia sabado");
         case DOMINGO:
            System.out.println("Dia domingo");
            break;
      }

   }

}
