package ro.ase.cts.facade;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Pacient p = new Pacient("Ionel", 4);
        Salon salon= new Salon(new HashMap<>(){
            {
                put(1, true);
                put(2, true);
                put(3, true);
            }
        });

        if(VerificaInternare.verificaInternare(p, salon)){
            System.out.println("Verificare efectuata");
        }
    }
}
