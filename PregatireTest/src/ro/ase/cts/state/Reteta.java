package ro.ase.cts.state;

public class Reteta {
    private String denumire;
    private double total;
    private Stare stare;

    public Reteta(String denumire, double total) {
        this.denumire = denumire;
        this.total = total;
        this.stare = new StareEmisa();
    }

    public Stare getStare() {
        return stare;
    }

    public void setStare(Stare stare) {
        this.stare = stare;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
