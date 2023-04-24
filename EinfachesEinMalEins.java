public class EinfachesEinMalEins {

    public static void main(String[]args){

        System.out.print("    ");
        for (int i = 1; i < 10; i++){       //i = 1 damit das ein mal einz keine 0 zeihle gipt
            System.out.print(i + "  ");
        }
        
        System.out.println();
        System.out.println();

        for (int i = 1; i < 10; i++){       //i = 1 damit das ein mal einz keine 0 zeihle gipt
            System.out.print(i + "  ");
            for (int j = 1; j < 10; j++){   //j = 1 damit das ein mal einz keine 0 zeihle gipt
                int ersteZahl = i;
                int zweiteZahl = j;
                int resultat = ersteZahl * zweiteZahl;
                if (resultat < 10){
                    System.out.print(" " + resultat + " ");
                }
                else {
                    System.out.print(resultat + " ");
                }
            }
            System.out.println();
        }
    }
}
