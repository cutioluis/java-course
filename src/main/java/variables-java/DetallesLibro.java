package VariablesJava;

import java.util.Scanner;

public class DetallesLibro {
    public static void main(String args[]) {
        // Proporcionar informacion de un libro usando scanner
        System.out.println(" Bienvenido, Dime que libro necesitas guardar");
        Scanner input = new Scanner(System.in);

        System.out.println("Dime el nombre de la libro");
        String nameBook = input.nextLine();

        System.out.println(" Dime el autor del iabro");
        String autorBook = input.nextLine();

        System.out.println("Perfecto 😎 el libro " + nameBook + ": " + autorBook + " Se ha guardado correctamente");

    }
}
