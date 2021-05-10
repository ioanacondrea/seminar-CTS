package ro.ase.cts.prototype;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Reteta r = new Reteta(100, new HashMap<>(){{put("ibuprofen", 1200.0); put("magneziu", 250.0);}});
        Reteta r2 = (Reteta) r.clone();

        System.out.println(r.toString());
        System.out.println(r2.toString());
    }
}
