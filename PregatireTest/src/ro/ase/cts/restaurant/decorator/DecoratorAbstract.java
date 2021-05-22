package ro.ase.cts.restaurant.decorator;

public abstract class DecoratorAbstract implements NotaDePlataAbstract{
        protected NotaDePlata notaDePlata;

    public DecoratorAbstract(NotaDePlata notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    public NotaDePlata getNotaDePlata() {
        return notaDePlata;
    }

    @Override
        public void printeazaNotaDePlata(){
            notaDePlata.printeazaNotaDePlata();
        }

        public abstract void printeazaCuFelicitare(int suma);
}
