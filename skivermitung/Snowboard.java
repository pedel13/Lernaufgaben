
public class Snowboard extends ProduktNr{

    //konstruktor
    public Snowboard(String marke, double preis, double grosse, int produktNr, String art){ 

        //konstruktor
        super(preis,produktNr);
        this.marke = marke;
        this.grosse = grosse;
        this.art = art;

    }

    private String marke;
    private double grosse;
    private String art;

    // setter
    public void setArt(String art){

        this.art = art;
    }
    
    //getter
    public String getArt(){

        return this.art;
    }

    public void setGrosse(double grosse){

        this.grosse = grosse;
    }

    public double getGrosse(){

        return this.grosse;
    }

    public void setMarke(String marke){

        this.marke = marke;
    }

    public String getMarke(){

        return marke;
    }
    
   
   
   
   
   
    public void printAttribut(){

        System.out.println("preis: " + getPreis() + " grosse: " + this.grosse + " produktNr: " + getProduktNr());
    }

}
