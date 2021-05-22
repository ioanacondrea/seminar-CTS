package ro.ase.cts.command;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        Reteta r1 = new Reteta("32432", 333);
        Reteta r2 = new Reteta("3432d", 300);
        operator.invoca(new ComandaPreiaReteta(r1));
        operator.invoca(new ComandaPreiaReteta(r2));
        operator.executaComanda();

    }
}
