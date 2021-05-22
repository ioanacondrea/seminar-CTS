package ro.ase.cts.restaurant.adapter;

public class Main {
    public static void main(String[] args) {
        FacturaRestaurant facturaRestaurant = new FacturaRestaurant(100);
        facturaRestaurant.printeazaFacturaRestaurant();
        AdapterFactura factura = new AdapterFactura(200);
        factura.printeazaFacturaBar();
    }
}
