
import java.util.Scanner;

public class VerUndEntschluslung2 {

    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        boolean lauft = true;
        String passwort = "";
        
        
        while (lauft){
            System.out.println("Gebensi Ein: Verschlüsseln = v, Entschlüsseln = e, quit = q");
            char auswahl = sc.next().charAt(0);
            
            if (auswahl == 'v'){
                passwort =encrypt();
                System.out.println(passwort);
            }
            
            if (auswahl == 'e'){
                passwort = edecrypt();
                System.out.println(passwort);
                
                
            }
            
            if (auswahl == 'q'){
                lauft = false;
            }
        }
    }
    
    
    static String encrypt(){
        
        char untergrenze = 'a';
        while (Character.isDefined(untergrenze)){
            untergrenze++;
            if (untergrenze < -300){
                break;
            }
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.println
        System.out.println("Gib dein Passwort ein:");
        String passwort = sc.nextLine();
        int textLange = passwort.length();
        char buchstabe = 'b';
        for (int i = 0; i < textLange; i++){
            buchstabe = passwort.charAt(i);
            char klein = Character.toLowerCase(buchstabe);
            
            for (int j = 0; j < ){
                klein++;
                if (!Character.isDefined(klein)){
                    klein = untergrenze;
                }
            }

            
            passwort = passwort.replace(buchstabe,klein);
        }
            
        return passwort;     
    }
    static String edecrypt() {

        char obergrenze = 'a';
       
        while (Character.isDefined(obergrenze)){
            obergrenze++;
            if (obergrenze > 500){
                break;
            }
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie ein verschlüsseltes Passwort ein?");
        String passwort = sc.nextLine();
        int textLenge = passwort.length();
        char neuBuchstabe = 1;
        for (int i = 0; i < textLenge; i++){
            char buchstabe = passwort.charAt(i);
            neuBuchstabe = buchstabe;
            neuBuchstabe--;
            
            if (!Character.isDefined(neuBuchstabe)){
                neuBuchstabe = obergrenze;
            }

            neuBuchstabe--;
            
            if (!Character.isDefined(neuBuchstabe)){
                neuBuchstabe = obergrenze;
            }

            char gross = Character.toUpperCase(neuBuchstabe);
            passwort = passwort.replace(buchstabe,gross);
        }
        
        return passwort;
    }
}
