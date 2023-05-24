public class ProduktNr {


    public ProduktNr(double preis, int produktNr){

        this.preis = preis;
        this.produktNr = produktNr;
    }


    private double preis;
    private int produktNr;
    

    public void setPreis (double preis){
        this.preis = preis;
    }

    public double getPreis(){
        return this.preis;
    }

    public void setProdukNr(int produktNr){
        this.produktNr = produktNr;
    }

    public int getProduktNr(){
        return this.produktNr;
    }
}
