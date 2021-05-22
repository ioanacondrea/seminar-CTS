package ro.ase.cts.restaurant.composite;

public class ItemMeniu implements ComponentaMeniu{
    private String denumire;

    public ItemMeniu(String denumire) {
        this.denumire = denumire;
    }

    @Override
    public void descriere() {
        System.out.println("Item: " + denumire);
    }

    @Override
    public void adaugaComponenta(ComponentaMeniu comp) {

    }

    @Override
    public void stergeComponenta(ComponentaMeniu comp) {

    }

    @Override
    public ComponentaMeniu getComponentta(int index) throws Exception {
        return null;
    }
}
