package ro.ase.cts.facade;


import java.util.Map;

public class Salon {
    private Map<Integer, Boolean> locuri;

    public Salon(Map<Integer, Boolean> locuri) {
        this.locuri = locuri;
    }

    public boolean verificaDisponibilitateLoc(){
        if(locuri.values().contains(Boolean.FALSE)){
            return true;
        }
        else return false;
    }
}
