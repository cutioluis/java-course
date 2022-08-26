package testencapsu;

import conversionobjetos.Escritor;
import conversionobjetos.Persona;
import conversionobjetos.TiposEscritura;

public class ConversionObjetos {
   public static void main(String[] args) {
      Persona persona;
      // persona = new Persona("Luis", 12321);
      /// System.out.println(persona);

      persona = new Escritor("Luis", 1221, TiposEscritura.CLASICA);
      System.out.println(persona.obtenerDetalles());

      persona = new Persona("Luis", 1212);
      System.out.println(persona.obtenerDetalles());

      //* DOWNCASTING */
      // Supongamos que tenemos un metodo en la CLASE ESCRITOR
      // persona.getTipoDeEscritura(); //! The method is undefined for the type
      // Persona

      // * Para poder acceder necesitamos transformar el tipo de dato
      Escritor escritor = (Escritor) persona;
      System.out.println(escritor.sayHello());

      // * UPPERCASTING *//
      // Aqui no hacemos el conversion explisita
      Persona persona2 = escritor;
   }
}
