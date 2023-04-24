
import java.util.Scanner;

public class Summe {
    
    public static void main(String[]args){
        
        try (Scanner sc = new Scanner(System.in)) {
            int resultat = 0;
            System.out.println("Geben sie eine zahlein");
            int zahlNeu = sc.nextInt();
            resultat = resultat + zahlNeu;
            while (zahlNeu != 0){
                System.out.println("Nechste Zahl?");
                zahlNeu = sc.nextInt();
                resultat = resultat + zahlNeu;
            }

            System.out.println(resultat);
        }
    }
    
}
