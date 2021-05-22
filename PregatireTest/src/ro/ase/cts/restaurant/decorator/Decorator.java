package ro.ase.cts.restaurant.decorator;

public class Decorator extends DecoratorAbstract{
    public Decorator(NotaDePlata notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaCuFelicitare(int suma) {
        System.out.println("S-a atasat felicitare la nota de plata cu suma "+ super.getNotaDePlata().getSuma());
    }
}
