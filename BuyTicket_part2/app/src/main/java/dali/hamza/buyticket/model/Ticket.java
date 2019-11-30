package dali.hamza.buyticket.model;

public class Ticket {

    private String id;
    private String date;
    private float price;
    private int nombre;

    public Ticket(String id, String date, float price, int nombre) {
        this.id = id;
        this.date = date;
        this.price = price;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNombre() {
        return nombre;
    }

    public void setNombre(int nombre) {
        this.nombre = nombre;
    }
}
