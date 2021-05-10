package ro.ase.cts.facade;

public class Pacient {
    private String nume;
    private int stare; // de la 1 la 5

    public Pacient(String nume, int stare) {
        this.nume = nume;
        this.stare = stare;
    }

    public String getNume() {
        return nume;
    }

    public int getStare() {
        return stare;
    }

    public boolean verificaStare(){
        if(stare>2){
            return true;
        }
        else return false;
    }
}
