package ro.ase.cts.flyweight;

import ro.ase.cts.flyweight.Pacient;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory{
    private Map<String, Pacient> pacienti;

    public FlyweightFactory() {
        super();
        this.pacienti = new HashMap<String, Pacient>();
    }

    public Pacient getPacient(String telefon){
        Pacient pacient = pacienti.get(telefon);
        if(pacienti.get(telefon) == null){
            pacient = new Pacient("NOU", telefon, "dsadas");
            pacienti.put(telefon, pacient);
        }
        return pacient;
    }
}
