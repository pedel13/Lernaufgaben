import java.util.Scanner;

public class Taschenrechner2 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        boolean menu = true;

        while (menu){
            System.out.println("Geben sie ein: Addition; 1  Suptraktion; 2  Multiplikation; 3  Division; 4  Modulo; 5");
            int rechnungsArt = sc.nextInt();
            System.out.println("Geben sie die erste Zahl ein:");
            int ersteZahl = sc.nextInt();
            System.out.println("Geben sie die Zweite Zahl ein:");
            int zweiteZahl = sc.nextInt();
            switch (rechnungsArt){
                case 1:
                    System.out.println(ersteZahl + zweiteZahl);
                    break;
                case 2:
                    System.out.println(ersteZahl - zweiteZahl);
                    break;
                case 3:
                    System.out.println(ersteZahl * zweiteZahl);
                    break;
                case 4:
                    System.out.println(ersteZahl / zweiteZahl);
                    break;
                case 5:
                    System.out.println(ersteZahl % zweiteZahl);
                    break;
                default:
                    System.out.println("Falsche Eingabe!");

            }

        }

    }

}
