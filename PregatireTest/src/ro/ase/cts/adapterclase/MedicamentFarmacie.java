package ro.ase.cts.adapterclase;

public class MedicamentFarmacie {
    private String numeMedicament;
    private double pret;

    public MedicamentFarmacie(String numeMedicament, double pret) {
        this.numeMedicament = numeMedicament;
        this.pret = pret;
    }

    public MedicamentFarmacie() {
        
    }

    public void cumparaMedicament(){
        System.out.println("S-a cumparata " + numeMedicament + " la pretul de "+ pret );
    }
}
