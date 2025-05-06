package es1;

import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {
//esercizio paridispari
       boolean ciao= stringaPariDispari();
        System.out.println(ciao);

        // esercizio data
        boolean data = annoBisestile();
        System.out.println(data);

    }
    public static boolean stringaPariDispari(){
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("inserisci la stringa ");
        String str= scanner2.nextLine();
      int c=  str.length();
        return str.length() % 2 == 0;
    }
    public static boolean annoBisestile(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("inserisci la data per verificare che sia bisestile o meno");
        int anno= scanner.nextInt();
       return  (anno % 4 == 0) && ((anno % 100 != 0) || (anno % 400 == 0));
    }
}
