package ro.ase.cts.singleton;

public class Spital {
    private String nume;
    private int nrLocuri;
    private static Spital instanta = null;

    private Spital(String nume, int nrLocuri) {
        this.nume = nume;
        this.nrLocuri = nrLocuri;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public void setNrLocuri(int nrLocuri) {
        this.nrLocuri = nrLocuri;
    }

    public static void setInstanta(Spital instanta) {
        Spital.instanta = instanta;
    }

    @Override
    public String toString() {
        return "Spital{" +
                "nume='" + nume + '\'' +
                ", nrLocuri=" + nrLocuri +
                '}';
    }

    public static synchronized Spital getInstanta(String nume, int nrLocuri) {
        if(instanta==null){
            instanta = new Spital(nume, nrLocuri);
        }
        return instanta;
    }
}
