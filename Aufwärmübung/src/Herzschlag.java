import java.util.Scanner;

public class Herzschlag {
    public static void main(String[] args) throws Exception {
        

        Scanner sc = new Scanner(System.in);
        Uebung1 uebung1 = new Uebung1();

        int alter = uebung1.getIntValueWithPrompt();
        System.out.println("wie hoch ist ihr Herzschlag");
        int herzschlag = sc.nextInt();
        System.out.print("ihr Herz schlug schon " + ((((herzschlag * 60)*24)*365)*alter) + " mal");
        
    }


}
