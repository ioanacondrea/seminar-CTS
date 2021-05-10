package ro.ase.cts.builder;

public class BuilderInternare implements Builder{
    private Internare internare;

    public BuilderInternare(Internare internare) {
        super();
        this.internare = new Internare("N/A", false, false, false, false);
    }

    public BuilderInternare() {

    }

    public BuilderInternare setNumePacient(String numePacient) {
        internare.setNumePacient(numePacient);
        return this;
    }

    public BuilderInternare setPatRabatabil(boolean patRabatabil) {
       internare.setPatRabatabil(patRabatabil);
       return this;
    }

    public BuilderInternare setMicDejunInclus(boolean micDejunInclus) {
        internare.setMicDejunInclus(micDejunInclus);
        return this;

    }

    public BuilderInternare setPapuciCamera(boolean papuciCamera) {
        internare.setPapuciCamera(papuciCamera);
        return this;
    }

    public BuilderInternare setHalatInterior(boolean halatInterior) {
        internare.setHalatInterior(halatInterior);
        return this;
    }

    @Override
    public Internare build() {
        return this.internare;
    }
}
