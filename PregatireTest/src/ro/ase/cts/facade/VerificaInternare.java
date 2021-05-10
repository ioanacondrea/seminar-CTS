package ro.ase.cts.facade;

public class VerificaInternare {
    public static boolean verificaInternare(Pacient pacient, Salon salon) {
        if (pacient.verificaStare()) {
            System.out.println("Pacientul are starea necesara de internat");
            if (Medic.verificaInternare(pacient.getStare())) {
                System.out.println("Medicul aproba");
                if (salon.verificaDisponibilitateLoc()) {
                    System.out.println("Pacientul poate fi internat in salon");
                    return true;
                } else {
                    System.out.println("Nu exista locuri libere in salon");
                    return false;
                }
            } else return false;
        } else return false;
    }
}
