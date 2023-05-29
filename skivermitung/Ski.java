 
public class Ski extends Produkt{
 
    public Ski(String marke, double preis, double grosse, int produktNr, String art){

        super(preis, produktNr);
        this.marke = marke;
        this.grosse = grosse;
        this.art = art;
    }

    private String marke;
    private double grosse;
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
        System.out.print(" Preis: " + getPreis());
        System.out.print(" Grösse: " + this.grosse);
        System.out.print(" produktNr: " + getProduktNr());
        System.out.println(" Art: " + this.art);
    }
}