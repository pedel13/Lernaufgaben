import java.util.Scanner;

public class TaschenRechner3 {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Geben sie eine zahl ein ");
        int resultat = sc.nextInt();
        boolean leuft = true;
        char operator = 'a';
        int zahl = 0;

        while (leuft){
            System.out.println("Wählen sie ein Operator: +, -, *, /, = für endresultat, c um zu löschen der rechnung, q um zu beehnden");
            operator = sc.next().charAt(0);
            switch (operator){
                case '+':
                    System.out.println("Geben sie noch eine Zahl ein:");
                    zahl = sc.nextInt();
                    resultat = resultat + zahl;
                    break;
                case '-':
                    System.out.println("Geben sie noch eine Zahl ein:");
                    zahl = sc.nextInt();
                    resultat = resultat - zahl;
                    break;
                case '*':
                    System.out.println("Geben sie noch eine Zahl ein:");
                    zahl = sc.nextInt();
                    resultat = resultat * zahl;
                    break;
                case '/':
                    System.out.println("Geben sie noch eine Zahl ein:");
                    zahl = sc.nextInt();
                    resultat = resultat / zahl;
                    break;
                case '=':
                    System.out.println(resultat);
                    break;
                case 'c':
                    resultat = 0;
                    System.out.println("Geben sie eine Zahl ein:");
                    resultat = sc.nextInt();
                    break;
                case 'q':
                    leuft = false;
                    break;
                default:
                    System.out.println("falsche eingabe Bitte Widerholen");
                    break;

            }
        }
    }
    
}
