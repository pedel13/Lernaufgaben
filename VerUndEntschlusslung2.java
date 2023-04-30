import java.util.Scanner;

public class VerUndEntschlusslung2 {

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


        System.out.println("Welches codwort wollen sie benuzen:");
        String codierWort = sc.nextLine();
        int codLenge = codierWort.length();
        int position = 0;

        for (int i = 0; i < textLange; i++){
            char buchstabe = passwort.charAt(i);
            char codBuchstabe = codierWort.charAt(position);
            char klein = Character.toLowerCase(buchstabe);
            
            if (klein >= 'a' & klein <= 'z'){
                for (int j = 0; j < (int)codBuchstabe; j++){
                    klein++;
                    if (klein > 'z'){
                        klein = 'a';
                    }
                } 
            }
            if (klein <= '9' & klein >= '0'){
                for (int j = 0; j < (int)codBuchstabe; j++){
                    klein++;
                    if (klein > '9'){
                        klein = '0';
                    }
                } 
            }
            neuPassword[i] = klein;

            position++;
            if (position+1 > codLenge){ //+1 weil die codlange bei 1 begint aber 1 schun die zweite posistin im codword ist
                position = 0;
            }
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
        String codierSchlussel = sc.nextLine();
        int codLenge = codierSchlussel.length();
        int position = 0;
       
        for (int i = 0; i < textLenge; i++){
            char buchstabe = passwort.charAt(i);
            char codBuchstabe = codierSchlussel.charAt(position);
            char gross = Character.toUpperCase(buchstabe);
            
            if (gross <= 'Z' & gross >= 'A'){
                for (int j = 0; j < (int)codBuchstabe; j++){
                    gross--;
                    if (gross > 'Z'){
                        gross = 'A';
                    }
                }
            }
            if (gross <= '9' & gross >= '0'){
                for (int j = 0; j < (int)codBuchstabe;j++){
                    gross--;
                    if (gross > '9'){
                        gross = '0';
                    }
                }
            }
            
            neuPassword[i] = gross;

            position++;
            if (position+1 > codLenge){ //+1 weil die codlange bei 1 begint aber 1 schun die zweite posistin im codword ist
                position = 0;
            }
        }
        
        System.out.println(neuPassword);
    }
}
