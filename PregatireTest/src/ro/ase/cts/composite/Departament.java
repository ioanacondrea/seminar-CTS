package ro.ase.cts.composite;

public interface Departament {
    void descriere();
    void adaugaDepartament(Departament departament);
    void stergeDepartament(Departament departament);
    Departament getDepartament(int index);

}
