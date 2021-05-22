package ro.ase.cts.command;

import java.util.List;

public class ComandaAduMedicamente implements IComanda{
    private Reteta reteta;

    public ComandaAduMedicamente(Reteta reteta) {
        this.reteta = reteta;
    }

    @Override
    public void executa() {
        this.reteta.aduMedicamente();
    }
}
