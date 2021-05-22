package ro.ase.cts.restaurant.factorymethod;

public abstract class Supa {
    private String denumireSupa;
    private int pret;

    public String getDenumireSupa() {
        return denumireSupa;
    }

    public void setDenumireSupa(String denumireSupa) {
        this.denumireSupa = denumireSupa;
    }

    public int getPret() {
        return pret;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public Supa(String denumireSupa, int pret) {
        this.denumireSupa = denumireSupa;
        this.pret = pret;
    }

    @Override
    public String toString() {
        return "Supa{" +
                "denumireSupa='" + denumireSupa + '\'' +
                ", pret=" + pret +
                '}';
    }

    
}
