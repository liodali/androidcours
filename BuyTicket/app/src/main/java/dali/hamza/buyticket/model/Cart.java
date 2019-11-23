package dali.hamza.buyticket.model;

public class Cart {

    private int nombreticket;
    private float totalprice;


    public Cart(int nombreticket, float totalprice) {
        this.nombreticket = nombreticket;
        this.totalprice = totalprice;
    }

    public int getNombreticket() {
        return nombreticket;
    }

    public void setNombreticket(int nombreticket) {
        this.nombreticket = nombreticket;
    }

    public float getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(float totalprice) {
        this.totalprice = totalprice;
    }
}
