package ro.ase.cts.state;

public class StareSolicitata implements Stare{
    @Override
    public void modificaStare(Reteta reteta) {
        if(!(reteta.getStare() instanceof StareSolicitata)){
            System.out.println("Reteta a fost solicitata");
            reteta.setStare(new StareSolicitata());
        }else{
            System.out.println("Reteta nu poate fi solicitata");
        }
    }
}
