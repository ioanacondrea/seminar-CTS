package ro.ase.cts.decorator;

public class Rezultat implements RezultatAbstract{
    private String denumireAnaliza;
    private float valoare;

    public Rezultat(String denumireAnaliza, float valoare) {
        this.denumireAnaliza = denumireAnaliza;
        this.valoare = valoare;
    }

    public String getDenumireAnaliza() {
        return denumireAnaliza;
    }

    public void setDenumireAnaliza(String denumireAnaliza) {
        this.denumireAnaliza = denumireAnaliza;
    }

    public float getValoare() {
        return valoare;
    }

    public void setValoare(float valoare) {
        this.valoare = valoare;
    }

    @Override
    public String toString() {
        return "Rezultat{" +
                "denumireAnaliza='" + denumireAnaliza + '\'' +
                ", valoare=" + valoare +
                '}';
    }

    @Override
    public void printeazaRezultat(){
        System.out.println(this.toString());
    }
}
