package ro.ase.cts.singleton;

public class Main {
    public static void main(String[] args){
        Spital s1 = Spital.getInstanta("Marius Nasta", 1000);
        Spital s2= Spital.getInstanta("Floreasca", 2000);
        System.out.println(s1.toString());
        System.out.println(s2.toString());
        s2.setNume("Medicover Baneasa");
        System.out.println(s2.toString());
    }
}
