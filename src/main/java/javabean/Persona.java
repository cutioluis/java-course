package javabean;

import java.io.Serializable;

// para que e considere un  JAVA BEAN necesita implementar desde la interface Serializable
//! El concepto de Serializable es que transformar al enviar a red a 0 y 1 oasea bits
//! Caundo lo recibes des desereliza
public class Persona implements Serializable {

   // Sus atributos son privados
   String nombre;
   String apellido;

   // Un constructor vacio
   public Persona() {
   }

   public String getNombre() {
      return nombre;
   }

   public void setNombre(String nombre) {
      this.nombre = nombre;
   }

   public String getApellido() {
      return apellido;
   }

   public void setApellido(String apellido) {
      this.apellido = apellido;
   }

   @Override
   public String toString() {
      return "Persona [apellido=" + apellido + ", nombre=" + nombre + "]";
   }

   

}
