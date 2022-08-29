package interfaces;

// a diferencia de la palabra reservda class
// Al no ser una clase no heredamos de OBJECT NO extiende de ningun metodo
//* Usamos interface

public interface IAccesoDatos {
   // ! No tiene constructorres
   // No tiene constructores

   // cualquier atributo que asignamos en una interface va a ser una CONSTANTE
   // Ademas tienes que asignar un valro
   int MAX_REGISTROS = 10;

   // * Los metodos son abstractos(no tienen cuerpo) y son publicos
   void insertar();

   void listar();

   void actualizar();

   void eliminar();
}
