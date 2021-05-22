package ro.ase.cts.restaurant.composite;

public interface ComponentaMeniu {
    void descriere();
    void adaugaComponenta(ComponentaMeniu comp);
    void stergeComponenta(ComponentaMeniu comp);
    ComponentaMeniu getComponentta(int index) throws Exception;


}
