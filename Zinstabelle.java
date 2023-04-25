
import java.util.Scanner;

public class Zinstabelle {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Wie gross ist ihr Kapital?");
        double kapital = sc.nextDouble();
        System.out.println("Wie hoch ist Ihr Zinssatz?");
        double zinsSatz = sc.nextDouble();
        System.out.println("Wie Lange bleipt das Geld da?");
        int laufZeit = sc.nextInt();

        System.out.println("Anfangskapital:  " + kapital);
        System.out.println("Zinssatz:  " + zinsSatz);
        System.out.println("Laufzeit:   " + laufZeit);
        System.out.println("Jahr    Zins    Kapital");
    
        for (int i = 1; i < laufZeit; i++){
            double zins = kapital * zinsSatz / 100;
            kapital = zins + kapital;
            if (i < 10){
                System.out.println(i + "     " + String.format("%1.2f", zins) + "    " + String.format("%1.2f", kapital));
            }
            else {
                System.out.println(i + "    " + String.format("%1.2f", zins) + "    " + String.format("%1.2f", kapital));
            }
        }
    }
}
