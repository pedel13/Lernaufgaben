public class Kleidung extends Produkt{
    public Kleidung(String marke, double preis, double grosse, String farbe, int produktNr){

        super(preis, produktNr);
        this.marke = marke;
        this.grosse = grosse;
        this.farbe = farbe;

    }

    private String marke;
    private double grosse;
    private String farbe;


    public void setMarke(){
        this.marke = marke;
    }

    public String getMarke(){
        return this.marke;
    }

    public void setGross(){
        this.grosse = grosse;
    }

    public double getGrosse(){
        return this.grosse;
    }

    public void setFarbe(){
        this.farbe = farbe;
    }

    public String getFarbe(){
        return this.farbe;
    }




    public void printAttribut(){

        System.out.print("Marke: " + this.marke);
        System.out.print(" Preis: " + getPreis());
        System.out.print(" Grösse: " + this.grosse);
        System.out.print(" Farbe: " + this.farbe);
        System.out.println(" Produkt Nr.: " + getProduktNr());
    }
}
