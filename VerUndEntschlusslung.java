import java.util.Scanner;

public class VerUndEntschlusslung {

    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        boolean lauft = true;
        
        
        while (lauft){
            System.out.println("Gebensi Ein: Verschlüsseln = v, Entschlüsseln = e, quit = q");
            char auswahl = sc.next().charAt(0);
            
            if (auswahl == 'v'){
                encrypt();
            }
            
            if (auswahl == 'e'){
                edecrypt();
                
            }
            
            if (auswahl == 'q'){
                lauft = false;
            }
        }
    }
    
    
    static void encrypt(){
        

        
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib dein Passwort ein:");
        String passwort = sc.nextLine();
        int textLange = passwort.length();
        char[] neuPassword = new char[textLange];
        int position = 0;


        System.out.println("Welche zahl wollen sie zum codiren:");
        int codierNummer = sc.nextInt();
        
         for (char c : passwort.toCharArray()){
            char buchstabe = c;
            char klein = Character.toLowerCase(buchstabe);
            if (klein >= 'a' & klein <= 'z'){
                klein = (char)(klein + codierNummer);
                int rest =  (int)'z' - klein; 
                    if (klein > 'z'){
                        klein = 'a';
                        klein = (char) (klein + rest);
                    }
                
            }
            if (klein <= '9' & klein >= '0'){
                for (int j = 0; j < codierNummer; j++){
                    klein++;
                    if (klein > '9'){
                        klein = '0';
                    }
                } 
            }
            neuPassword[position] = klein;
            position++;
        }

        System.out.println(neuPassword);  
    }

    static void edecrypt() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie ein verschlüsseltes Passwort ein?");
        String passwort = sc.nextLine();
        int textLenge = passwort.length();
        char[] neuPassword = new char[textLenge];
        int position = 0;

        System.out.println("Welchen Codierschlüssel wollen sie ferwenden");
        int codierSchlussel = sc.nextInt();

        for (char c : passwort.toCharArray()){
            char buchstabe = c;
            char gross = Character.toUpperCase(buchstabe);

            if (gross <= 'Z' & gross >= 'A'){
                gross = (char)(gross - codierSchlussel);
                int rest = gross - (int)'A';
                    if (gross < 'A'){
                        gross = (char)(gross + rest);
                    }
            }

            if (gross <= '9' & gross >= '0'){
                for (int j = 0; j < codierSchlussel;j++){
                    gross--;
                    if (gross < '0'){
                        gross = '9';
                    }
                }
            }

            neuPassword[position] = gross;
            position++;
        }
        
        System.out.println(neuPassword);
    }
}
