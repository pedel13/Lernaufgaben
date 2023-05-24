public class Kleidung {
    public Kleidung(String marke, double preis, double grosse, String farbe, int produktNr){

        this.marke = marke;
        this.preis = preis;
        this.grosse = grosse;
        this.farbe = farbe;
        this.produktNr = produktNr;
    }

    private String marke;
    private double preis;
    private double grosse;
    private String farbe;
    private int produktNr;


    public void setMarke(){
        this.marke = marke;
    }

    public String getMarke(){
        return this.marke;
    }

    public void setPreis(){
        this.preis = preis;
    }

    public double getPreis(){
        return this.preis;
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

    public void setProduktNr(){
        this.produktNr = produktNr;
    }

    public int getProduktNr(){
        return this.produktNr;
    }


    public void printAttribut(){

        System.out.print("Marke: " + this.marke);
        System.out.print(" Preis: " + this.preis);
        System.out.print(" Grösse: " + this.grosse);
        System.out.print(" Farbe: " + this.farbe);
        System.out.println(" Produkt Nr.: " + this.produktNr);
    }
}
