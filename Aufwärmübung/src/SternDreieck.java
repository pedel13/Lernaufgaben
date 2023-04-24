
import java.util.Scanner;

public class SternDreieck {
    

    public static void main(String[]args){

        try(Scanner sc = new Scanner(System.in)){

            System.out.println("Wie gross soll das Dreieck sein");
            int size = sc.nextInt();

            for (int i = 0; i <= size; i++){
                for (int j = 0; j < i; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
