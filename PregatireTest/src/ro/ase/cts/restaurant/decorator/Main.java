package ro.ase.cts.restaurant.decorator;

public class Main {
    public static void main(String[] args) {
        NotaDePlata nota = new NotaDePlata(100);
        nota.printeazaNotaDePlata();
        Decorator notaFelicitare = new Decorator(nota);
        notaFelicitare.printeazaCuFelicitare(100);
    }
}
