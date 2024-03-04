import java.util.Scanner;

public class Esercizio2 {

public static String concatenaOrdinato(String stringa1,String stringa2,String stringa3){
    return stringa1 + stringa2 + stringa3;

}

public static String concatenaInverso(String string1, String string2, String string3){
    return string3 + string2+ string1;
}

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci prima stringa");
        String stringa1 = scanner.nextLine();

        System.out.print("Inserisci seconda stringa");
        String stringa2 = scanner.nextLine();

        System.out.print("Inserisci terza stringa");
        String stringa3 = scanner.nextLine();

        System.out.println("concatenazione ordinata: " + concatenaOrdinato(stringa1, stringa2, stringa3));
        System.out.println("concatenazione invertita: " + concatenaInverso(stringa1, stringa2, stringa3));
        scanner.close();
    }
}
