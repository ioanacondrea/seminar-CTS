package ro.ase.cts.factory;

public class Factory {
    public PersonalSpital createInstance( TipPersonal tip, String nume, int cod) throws Exception {
        switch (tip){
            case Brancardier:
                return new Brancardier(nume, cod);
            case Medic:
                return new Medic(nume, cod);
            case Asistent:
                return  new Asistent(nume, cod);
            default:
                throw new Exception("Tip invalid");
        }
    }
}
