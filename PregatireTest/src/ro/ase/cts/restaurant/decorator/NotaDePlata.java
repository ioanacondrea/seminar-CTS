package ro.ase.cts.restaurant.decorator;

public class NotaDePlata implements NotaDePlataAbstract{
    private double suma;

    public NotaDePlata(double suma) {
        this.suma = suma;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    @Override
    public void printeazaNotaDePlata() {
        System.out.println("S-a printat nota de plata in valoare de "+ suma);
    }

}
