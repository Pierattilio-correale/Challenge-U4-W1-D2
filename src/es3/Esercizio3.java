package es3;

import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String myString;
        System.out.println("Inserisci la tua stringa (o ':q' per uscire):");
        myString = scanner.nextLine();

        while (!myString.equals(":q")) {
            for (int i = 0; i < myString.length(); i++) {
                System.out.print(myString.charAt(i));
                if (i < myString.length() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();

            System.out.println("Inserisci la tua stringa (o ':q' per uscire):");
            myString = scanner.nextLine();
        }
    }
}
