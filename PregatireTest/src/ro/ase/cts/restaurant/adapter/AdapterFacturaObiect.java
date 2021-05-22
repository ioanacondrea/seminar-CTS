package ro.ase.cts.restaurant.adapter;

public class AdapterFacturaObiect  implements FacturaBar{
    private FacturaRestaurant facturaRestaurant;
    public AdapterFacturaObiect(FacturaRestaurant facturaRestaurant) {
        this.facturaRestaurant = facturaRestaurant;
    }

    @Override
    public void printeazaFacturaBar() {
        this.facturaRestaurant.printeazaFacturaRestaurant();
    }
}
