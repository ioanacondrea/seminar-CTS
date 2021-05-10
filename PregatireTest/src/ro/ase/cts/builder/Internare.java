package ro.ase.cts.builder;

public class Internare {
    private String numePacient;
    private boolean patRabatabil;
    private boolean micDejunInclus;
    private boolean papuciCamera;
    private boolean halatInterior;

    public Internare(String numePacient, boolean patRabatabil, boolean micDejunInclus, boolean papuciCamera, boolean halatInterior) {
        this.numePacient = numePacient;
        this.patRabatabil = patRabatabil;
        this.micDejunInclus = micDejunInclus;
        this.papuciCamera = papuciCamera;
        this.halatInterior = halatInterior;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public void setMicDejunInclus(boolean micDejunInclus) {
        this.micDejunInclus = micDejunInclus;
    }

    public void setPapuciCamera(boolean papuciCamera) {
        this.papuciCamera = papuciCamera;
    }

    public void setHalatInterior(boolean halatInterior) {
        this.halatInterior = halatInterior;
    }

    public Internare() {
    }
}
