package ro.ase.cts.restaurant.composite;

import java.util.ArrayList;
import java.util.List;

public class Sectiune implements ComponentaMeniu{
    private String denumire;
    private List<ComponentaMeniu> componente;

    public Sectiune(String denumire) {
        this.denumire = denumire;
        this.componente = new ArrayList<>();
    }

    @Override
    public void descriere() {
        System.out.println("Sectiune: "+ denumire);
        for (ComponentaMeniu c: componente
             ) {
           c.descriere();
        }
    }

    @Override
    public void adaugaComponenta(ComponentaMeniu componentaMeniu) {
        componente.add(componentaMeniu);
    }

    @Override
    public void stergeComponenta(ComponentaMeniu comp) {
        componente.remove(comp);
    }

    @Override
    public ComponentaMeniu getComponentta(int index) throws Exception {
       if(index< 0 || index >= componente.size()){
           throw new Exception();
       }
       return componente.get(index);
    }
}
