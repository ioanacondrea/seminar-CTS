package ro.ase.cts.restaurant.composite;

public class MAin {
    public static void main(String[] args) {
        Sectiune meniu = new Sectiune("Meniu");
        Sectiune sectiune1 = new Sectiune("Bauturi");
        Sectiune sectiune2 = new Sectiune("Startere");
        ItemMeniu i1 = new ItemMeniu("suc");
        ItemMeniu i2 = new ItemMeniu("limonada");
        Sectiune sectiune3= new Sectiune("Cafele");
        ItemMeniu i3 = new ItemMeniu("Latte");
        ItemMeniu i4 = new ItemMeniu("supa crema");

        meniu.adaugaComponenta(sectiune1);
        meniu.adaugaComponenta(sectiune2);
        sectiune1.adaugaComponenta(sectiune3);
        sectiune1.adaugaComponenta(i1);
        sectiune1.adaugaComponenta(i2);
        sectiune3.adaugaComponenta(i3);
        sectiune2.adaugaComponenta(i4);

        sectiune1.descriere();
        meniu.descriere();
    }
}
