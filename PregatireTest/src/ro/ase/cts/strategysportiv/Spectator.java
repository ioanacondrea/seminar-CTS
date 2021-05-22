package ro.ase.cts.strategysportiv;


public class Spectator {
    private TipSpectator tipSpectator;
    private String nrLoc;
    private ModVerificare modVerificare;

    public Spectator(TipSpectator tipSpectator, String nrLoc) {
        this.tipSpectator = tipSpectator;
        this.nrLoc = nrLoc;
    }

    public void setModVerificare(ModVerificare modVerificare) {
        this.modVerificare = modVerificare;
    }

    public TipSpectator getTipSpectator() {
        return tipSpectator;
    }

    public void setTipSpectator(TipSpectator tipSpectator) {
        this.tipSpectator = tipSpectator;
    }

    public String getNrLoc() {
        return nrLoc;
    }

    public void setNrLoc(String nrLoc) {
        this.nrLoc = nrLoc;
    }

    public void verifica(){
        modVerificare.verificaSpectator();
    }

}
