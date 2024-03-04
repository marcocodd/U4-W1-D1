
public class Esercizio1 {
    public static int moltiplicazione (int num1, int num2){

        return num1*num2;
    }

    public static String concatena(String word, int num){
        return word + num;
    }

//    public static String[] inserisciInArray(String[] array, String stringa){
//
//    }

    public static void main(String[] args) {

        System.out.println("la moltiplicazione è: " + moltiplicazione(3,3));
        System.out.println("stringa e numero concatenati: " + concatena("ciao ", 10));

    }
}