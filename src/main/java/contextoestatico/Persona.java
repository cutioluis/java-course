package contextoestatico;

public class Persona {
   private int personId;
   private String nombre;
   private static int counterPerson;

   // * Constructor con sus parametros
   public Persona(String nombre) {
      this.nombre = nombre;
      Persona.counterPerson++;

      // Para acceder a este metodo no podemos usar la palabra this si la el nombre de
      // la Clase
      // this.counterPerson = counterPerson;
      this.personId = Persona.counterPerson;
   }

   // * Getters and setters
   public int getPersonId() {
      return personId;
   }

   public void setPersonId(int personId) {
      this.personId = personId;
   }

   public String getnombre() {
      return nombre;
   }

   public void setnombre(String nombre) {
      this.nombre = nombre;
   }

   public int getCounterPerson() {
      return counterPerson;
   }

   public void setCounterPerson(int counterPerson) {
      Persona.counterPerson = counterPerson;
   }

   // * Metodo toString()
   // Override se conoce como anotacion - estamos sobrescribiendo el metodo
   // toString() - mas adelante lo veremos a profundidad
   @Override
   public String toString() {
      return "Persona [nombre=" + nombre + ", personId=" + personId + "]";
   }
}
