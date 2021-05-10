package ro.ase.cts.adapterclase;

public class AdapterMedicament extends MedicamentFarmacie implements MedicamentSpital{

    public AdapterMedicament(String nume, double pret) {
        super(nume, pret);
    }

    @Override
    public void achizitioneazaMedicament() {
        if(prezintaReteta()){
            this.cumparaMedicament();
        }else{
            System.out.println("Reteta nu este buna");
        }

    }

    @Override
    public boolean prezintaReteta() {
        return true;
    }
}
