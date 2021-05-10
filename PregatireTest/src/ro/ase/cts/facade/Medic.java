package ro.ase.cts.facade;

public class Medic {
    public static boolean verificaInternare(int stare) {
        if (stare > 3) {
            return true;
        } else return false;
    }
}
