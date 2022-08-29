package interfaces;

public class ImplementsMySql implements IAccesoDatos {
   // no puede crear por que es abstracta por eso necesitamos crear todao los datos
   // O puedes marcar como abstracta pero recuerda que no vas a poder crear

   // Estos metodos no estamos sobrescribiendo recuerda solo estamos implementado
   @Override
   public void actualizar() {
      System.out.println("Actulizar desde MySQL");
   }

   @Override
   public void eliminar() {
      System.out.println("Eliminar desde MySQL");
   }

   @Override
   public void insertar() {
      System.out.println("Instertar desde MySQL");
   }

   @Override
   public void listar() {
      System.out.println("Listar desde MySQL");
   }

}
