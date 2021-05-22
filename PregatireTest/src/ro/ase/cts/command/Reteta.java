package ro.ase.cts.command;

public class Reteta {
    private String codReteta;
    private double total;

    public Reteta(String codReteta, double total) {
        this.codReteta = codReteta;
        this.total = total;
    }

    public String getCodReteta() {
        return codReteta;
    }

    public void setCodReteta(String codReteta) {
        this.codReteta = codReteta;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public void preiaReteta(){
        System.out.println("S-a preluat reteta "+ codReteta +" in valoare de "+ total);
    }

    public void aduMedicamente(){
        System.out.println("S-au adus medicamentele din reteta "+ codReteta);
    }
}
