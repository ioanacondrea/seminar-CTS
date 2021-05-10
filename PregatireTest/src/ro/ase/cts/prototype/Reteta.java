package ro.ase.cts.prototype;

import java.util.Map;

public class Reteta implements Cloner{
    private int cod;
    private Map<String,Double> cantitati;

    public Reteta(int cod, Map<String, Double> cantitati) {
        this.cod = cod;
        this.cantitati = cantitati;
    }

    @Override
    public String toString() {
        return "Reteta{" +
                "cod=" + cod +
                ", cantitati=" + cantitati +
                '}';
    }

    public Reteta() {
    }

    @Override
    public Cloner clone() {
        Reteta reteta = new Reteta();
        reteta.cantitati = this.cantitati;
        reteta.cod = this.cod;

        return reteta;
    }
}
