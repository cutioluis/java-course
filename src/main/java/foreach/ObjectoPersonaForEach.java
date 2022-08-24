package foreach;

public class ObjectoPersonaForEach {
   
   public static void main(String[] args) {

      // El for each usando objectos es lo mismo
      Persona personas[] = {new Persona("Luis"), new Persona("Alex")};
    
      // Aqui tambien podemos usar Persona  = Object recuerda que el padres es object
      for(Persona persona: personas) {
         System.out.println(persona);
      }
   }
}
