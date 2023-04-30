import java.util.Scanner;

public class VerUndEntschlusslung {

    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        boolean lauft = true;
        String passwort = "";
        
        
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


        System.out.println("Welche zahl wollen sie zum codiren:");
        int codierNummer = sc.nextInt();
        char buchstabe = 'b';
        
        for (int i = 0; i < textLange; i++){
            buchstabe = passwort.charAt(i);
            char klein = Character.toLowerCase(buchstabe);
            if (klein >= 'a' & klein <= 'z'){
                for (int j = 0; j < codierNummer; j++){
                    klein++;
                    if (klein > 'z'){
                        klein = 'a';
                    }
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
            neuPassword[i] = klein;
        }

        System.out.println(neuPassword);  
    }

    static void edecrypt() {


        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie ein verschlüsseltes Passwort ein?");
        String passwort = sc.nextLine();
        int textLenge = passwort.length();
        char[] neuPassword = new char[textLenge];

        System.out.println("Welchen Codierschlüssel wollen sie ferwenden");
        int codierSchlussel = sc.nextInt();

        for (int i = 0; i < textLenge; i++){
            char buchstabe = passwort.charAt(i);
            char gross = Character.toUpperCase(buchstabe);

            if (gross <= 'Z' & gross >= 'A'){
                for (int j = 0; j < codierSchlussel; j++){
                    gross--;
                    if (gross > 'Z'){
                        gross = 'A';
                    }
                }
            }
            if (gross <= '9' & gross >= '0'){
                for (int j = 0; j < codierSchlussel;j++){
                    gross--;
                    if (gross > '9'){
                        gross = '0';
                    }
                }
            }

            neuPassword[i] = gross;
        }
        
        System.out.println(neuPassword);
    }
}
