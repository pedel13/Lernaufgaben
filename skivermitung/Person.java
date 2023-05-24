 
import java.util.ArrayList;
import java.util.List;


public class Person{
 
  
    public Person(String name, String nachName, String adresse,int geburtsDatum, int telephonNr, int ausweisNr){


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
    private int telephonNr;
    private int ausweisNr;
    private List <ProduktNr> ausgewehlteProdukte = new ArrayList<ProduktNr>();


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

    public int getTelephonNr(){
        return this.telephonNr;
    }

    public void setAusweisNr(){
        this.ausweisNr = ausweisNr;
    }

    public int getAusweisNr(){
        return this.ausweisNr;
    }

    public void setAusgewehlteProdukte(ArrayList<ProduktNr> ausgewehlteProdukte){
        this.ausgewehlteProdukte = ausgewehlteProdukte;
    }

    public ArrayList<ProduktNr> getAusgewehlteProdukte(){
        return (ArrayList<ProduktNr>) this.ausgewehlteProdukte;
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