package es2;

import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero  compreso tra 0 e 3: ");

        int x = scanner.nextInt();
        String risultato = switchTry(x);

        System.out.println(risultato);
    }

    public static String switchTry(int x) {
        String risultato;
        switch (x) {
            case 0:
                risultato = "zero";
                break;
            case 1:
                risultato = "uno";
                break;
            case 2:
                risultato = "due";
                break;
            case 3:
                risultato = "tre";
                break;
            default:
                risultato = "Errore: il numero inserito non è valido";
        }
        return risultato;
    }
}
