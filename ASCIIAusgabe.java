
import java.util.Scanner;

public class ASCIIAusgabe {
    

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        char buchstabe = sc.next().charAt(0);
        char kleinBuchstabe = Character.toLowerCase(buchstabe);
        char grossBuchstabe = Character.toUpperCase(buchstabe);
        System.out.print(grossBuchstabe);
        System.out.println(" Gross: " + (int)grossBuchstabe + " Klein: " + (int) kleinBuchstabe);
    }
}
