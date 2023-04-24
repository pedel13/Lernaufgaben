
import java.util.Scanner;

public class SternRechteck {

    public static void main(String[]args){
    

        try (Scanner sc = new Scanner(System.in)){

            System.out.println("Breite?");
            int breite = sc.nextInt();
            System.out.println("Höhe?");
            int hohe = sc.nextInt();
        
            for (int i = 0; i < hohe; i++){
                for (int j = 0; j < breite; j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
