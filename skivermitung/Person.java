 
import java.util.ArrayList;
import java.util.List;


public class Person{
 
  
    public Person(String name, String nachName, String adresse,int geburtsDatum, String telephonNr, String ausweisNr){


        this.name = name;
        this.nachName = nachName;
        this.adresse = adresse;
        this.telephonNr = telephonNr;
        this.geburtsDatum = geburtsDatum;
        this.ausweisNr = ausweisNr;


    }

    private String name;
    private String nachName;
    private String adresse;
    private int geburtsDatum;
    private String telephonNr;
    private String ausweisNr;
    private List <Produkt> ausgewehlteProdukte = new ArrayList<Produkt>();


    public void setName(){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setNachName(){
        this.nachName = nachName;
    }

    public String getNachName(){
        return this.nachName;
    }

    public void setAdresse(){
        this.adresse = adresse;
    }

    public String getAdresse(){
        return this.adresse;
    }

    public void setGeburtsDatum(){
        this.geburtsDatum = geburtsDatum;
    }

    public int getGeburtsDatum(){
        return this.geburtsDatum;
    }

    public void setTelephonNr(){
        this.telephonNr = telephonNr;
    }

    public String getTelephonNr(){
        return this.telephonNr;
    }

    public void setAusweisNr(){
        this.ausweisNr = ausweisNr;
    }

    public String getAusweisNr(){
        return this.ausweisNr;
    }

    public void setAusgewehlteProdukte(Produkt p){
        this.ausgewehlteProdukte.add(p);
    }

    public ArrayList<Produkt> getAusgewehlteProdukte(){
        return (ArrayList<Produkt>) this.ausgewehlteProdukte;
    }

    public void printProdukte(){
        for (Produkt j: ausgewehlteProdukte){
            j.printAttribut();
        }
    }

    public double warenkorbBerechnung(){
        double inhalt = 0;
        for (Produkt j: ausgewehlteProdukte){
            inhalt = inhalt + j.getPreis();
        }
        return inhalt;
    }    
    public void printAttribut(){
        System.out.print("Name: " + this.name);
        System.out.print(" Nachname: " + this.nachName);
        System.out.print(" Adresse: " + this.adresse);
        System.out.print(" Geburts Datum: " + this.geburtsDatum);
        System.out.print(" Telephon Nr.: " + this.telephonNr);
        System.out.print(" Ausweis Nr.: " + this.ausweisNr);
        System.out.println(" Ausgewählte Produkte: " + this.ausgewehlteProdukte);
    }
}