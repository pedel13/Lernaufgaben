
import java.util.Scanner;

public class ZeichenZehlen {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie ein wort ein.");
        String wort = sc.nextLine();
        System.out.println("Welcher Buchstabe wollen sie zählen?");
        char buchstabe = sc.next().charAt(0);
        int wortLenge = wort.length();
        int zehler = 0;
        for (int i = 0; i < wortLenge; i++){
            char posizion = wort.charAt(i);
            if (posizion == buchstabe){
                zehler++;
            }
        }
        System.out.println("Das zeichen " + buchstabe + " kommt " + zehler + " Mal vor");
    }
    
}
