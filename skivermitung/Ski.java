 
public class Ski extends ProduktNr{
 
    public Ski(String marke, double preis, double grosse, int produktNr, String art){

        super(preis, produktNr);
        this.marke = marke;
        this.grosse = grosse;
        this.art = art;
    }

    private String marke;
    private double preis;
    private double grosse;
    private int produktNr;
    private String art;
    
    
    
    public void setMarke(){
        this.marke = marke;
    }

    public String getMarke(){
        return this.marke;
    }

    public void setGrosse(){
        this.grosse = grosse;
    }

    public double getGrosse(){
        return this.grosse;
    }

    public void setArt(){
        this.art = art;
    }

    public String getArt(){
        return this.art;
    }
    
    
    
    
    
    
    public void printAttribut(){

        System.out.print("Marke: " + this.marke);
        System.out.print(" Preis: " + this.preis);
        System.out.print(" Grösse: " + this.grosse);
        System.out.print(" produktNr: " + this.produktNr);
        System.out.println(" Art: " + this.art);
    }
}