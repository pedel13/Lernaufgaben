
import java.util.Scanner;

public class AlleZeichenZehlen {

    
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie ein einzeliger Text ein:");
        String text = sc.nextLine();
        int textLenge = text.length();
        char a = ('a');
        char z = ('z');
        int zehler = 0;
        char buchstabe = ('a');
        while ((int)a <= (int)z){
            for (int i = 0; i < textLenge; i++){
                buchstabe = text.charAt(i);
                char klein = Character.toLowerCase(buchstabe);
                if (a == klein){
                    zehler++;
                }
            }
            if (zehler > 0){
                System.out.println("Das Zeichen " + a + " kommt " + zehler + " Mal vor");
            }
            zehler = 0;
            a++;
        }
    }
}
