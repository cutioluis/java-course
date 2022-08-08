package VariablesJava;

public class Concatenacion {
    public static  void main(String args[]) {
        System.out.println("CONCATENACION JAVA");

        String name = "Luis";
        int age = 17;

        System.out.println( "Yo soy " + name + " Y tengo " +  age + " años");

        int a = 4;
        int b = 4;

        System.out.println(a + b);
        System.out.println(name + (a + b)); // Java dice a encontre una cadena de texto supongo de el resto es tambien texto

        System.out.println("CARACTERES ESPECIALES");
        System.out.println("name \n another" ); // Salto de linea
        System.out.println("name \t Luis"); // Tabulador
        System.out.println("");
    }
}
