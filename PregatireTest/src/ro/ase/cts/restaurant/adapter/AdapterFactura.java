package ro.ase.cts.restaurant.adapter;

public class AdapterFactura extends  FacturaRestaurant implements FacturaBar{
    public AdapterFactura(double suma) {
        super(suma);
    }

    @Override
    public void printeazaFacturaBar() {
        this.printeazaFacturaRestaurant();
    }
}
