 
public class Schuh extends Kleidung{
    
    
    public Schuh(String marke, double preis, double grosse, String farbe, int produktNr, String verschlussArt){

        super(marke, preis, grosse, farbe, produktNr); //ruft konstruktor von Kleidung auf.
        this.verschlussArt = verschlussArt;

    }

    //backup kontruktor ohne verschluss art
    public Schuh(String marke, double preis, double grosse, String farbe, int produktNr){

        super(marke, preis, grosse, farbe, produktNr); //ruft konstruktor von Kleidung auf.
        this.verschlussArt = "nicht angegeben";

    }

    private String verschlussArt;

    public void setVerschlussArt(String verschlussArt){
        this.verschlussArt = verschlussArt;
    }

    public String getVerschlussArt(){
        return this.verschlussArt;
    }

    public void printAttribut(){
        System.out.println("Preis " + this.getPreis() + " marke " + this.getMarke() + " Grösse " + this.getGrosse() + " Farbe " + this.getFarbe() + " ProduktNr. " + this.getProduktNr());
    }
}