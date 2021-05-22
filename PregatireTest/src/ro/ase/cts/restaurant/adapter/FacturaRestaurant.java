package ro.ase.cts.restaurant.adapter;

public class FacturaRestaurant {
    private double suma;

    public FacturaRestaurant(double suma) {
        this.suma = suma;
    }

    @Override
    public String toString() {
        return "FacturaRestaurant{" +
                "suma=" + suma +
                '}';
    }

    public void printeazaFacturaRestaurant(){
        System.out.println(this.toString());
    }
}
