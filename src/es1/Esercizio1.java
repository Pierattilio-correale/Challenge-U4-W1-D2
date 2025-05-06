package es1;

public class Esercizio1 {
    public static void main(String[] args) {
//esercizio paridispari
       boolean ciao= stringaPariDispari("ciaone");
        System.out.println(ciao);

        // esercizio data
        boolean data = annoBisestile(1900);
        System.out.println(data);
        boolean data2 = annoBisestile(2028);
        System.out.println(data2);
    }
    public static boolean stringaPariDispari(String str){
      int c=  str.length();
        return str.length() % 2 == 0;
    }
    public static boolean annoBisestile(int anno){
       return  (anno % 4 == 0) && ((anno % 100 != 0) || (anno % 400 == 0));
    }
}
