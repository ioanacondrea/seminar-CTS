package ro.ase.cts.strategysportiv;

public class Main {
    public static void seteazaModVerificare(Spectator spectator) throws Exception {
        switch (spectator.getTipSpectator()){
            case VIP:
                spectator.setModVerificare(new VerificaBilet());
            case Peluza: spectator.setModVerificare(new VerificareBagajSiHaine());
            case Tribuna: spectator.setModVerificare(new VerificareBagaj());
        }
    }

    public static void main(String[] args) {
        Spectator spectator = new Spectator(TipSpectator.VIP, "A4dsd");
        try {
            seteazaModVerificare(spectator);
            spectator.verifica();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
