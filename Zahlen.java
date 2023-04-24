
import java.util.Scanner;

public class Zahlen {

    public static void main(String[]args){}
    public Double zahl1(){

        Scanner sc = new Scanner(System.in);

        System.out.println("Erste Zahl?");
        double zahl = sc.nextDouble();
        return Math.round (zahl * 1000) / 1000.0;
    }

    public Double zahl2(){


      Scanner sc = new Scanner(System.in);

      System.out.println("Zweite Zahl?");
        double zahl = sc.nextDouble();
        return Math.round (zahl * 1000) / 1000.0;
    }
}
