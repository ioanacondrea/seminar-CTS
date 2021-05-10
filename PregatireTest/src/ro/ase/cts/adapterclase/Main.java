package ro.ase.cts.adapterclase;

public class Main {
    public static void cumparaMedicamentFarmacie(MedicamentFarmacie medicament){
        medicament.cumparaMedicament();
    }

    public static void cumparaMedicamentSpital(AdapterMedicament medicament){
        medicament.achizitioneazaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie med = new MedicamentFarmacie("Nurofen", 20);
        cumparaMedicamentFarmacie(med);

        AdapterMedicament medS = new AdapterMedicament("Paracetamol", 5);
        cumparaMedicamentSpital(medS);
    }
}

