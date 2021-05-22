package ro.ase.cts.command;

public class ComandaPreiaReteta implements IComanda{
    private Reteta reteta;

    public ComandaPreiaReteta(Reteta reteta) {
        this.reteta = reteta;
    }

    @Override
    public void executa() {
        reteta.preiaReteta();
    }
}
