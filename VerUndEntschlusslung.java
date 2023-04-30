import java.util.Scanner;

public class VerUndEntschlusslung {

    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        boolean lauft = true;
        
        
        while (lauft){
            System.out.println("Gebensi Ein: Verschlüsseln = v, Entschlüsseln = e, quit = q");
            char auswahl = sc.next().charAt(0);
            
            if (auswahl == 'v'){
                System.out.println("Gib dein Passwort ein:");
                String passwort = sc.next();
                System.out.println("Welche zahl wollen sie zum codiren:");
                int codierNummer = sc.nextInt();
                String neuPassword = encrypt(passwort, codierNummer);
                System.out.println(neuPassword);
            }
            
            if (auswahl == 'e'){
                System.out.println("Geben sie ein verschlüsseltes Passwort ein?");
                String passwort = sc.next();
                System.out.println("Welchen Codierschlüssel wollen sie ferwenden");
                int codierSchlussel = sc.nextInt();
                System.out.println(edecrypt(passwort, codierSchlussel));
                
            }
            
            if (auswahl == 'q'){
                lauft = false;
            }
        }
    }
    
    
    static String encrypt(String passwort, int codierNummer){
        

        String neuPassword = "";

         for (char c : passwort.toCharArray()){
            char klein = Character.toLowerCase(c);

            if (klein >= 'a' && klein <= 'z'){
                klein = (char)(klein + codierNummer);
                int rest =  (int)'z' - klein; 

                    if (klein > 'z'){
                        klein = 'a';
                        klein = (char) (klein + rest);
                    }
                
            }
            if (klein <= '9' && klein >= '0'){

                for (int j = 0; j < codierNummer; j++){
                    klein++;
                
                    if (klein > '9'){
                        klein = '0';
                    }
                } 
            }
           neuPassword = neuPassword + klein;
        }

        return neuPassword;  
    }

    static String edecrypt(String passwort, int codierSchlussel) {


        String neuPassword = "";


        for (char c : passwort.toCharArray()){
            char gross = Character.toUpperCase(c);

            if (gross <= 'Z' && gross >= 'A'){
                gross = (char)(gross - codierSchlussel);
                int rest = gross - (int)'A';

                    if (gross < 'A'){
                        gross = (char)(gross + rest);
                    }
            }

            if (gross <= '9' && gross >= '0'){
                for (int j = 0; j < codierSchlussel;j++){
                    gross--;
                    if (gross < '0'){

                        gross = '9';
                    }
                }
            }

            neuPassword = neuPassword + gross;
        }
        return neuPassword; 
    }
}
