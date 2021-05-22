package ro.ase.cts.state;

public class StareAchizitionata implements Stare{
    @Override
    public void modificaStare(Reteta reteta) {
        if(reteta.getStare() instanceof StareSolicitata){
            System.out.println("Reteta a fost azhizionata.");
            reteta.setStare(new StareAchizitionata());
        }else{
            System.out.println("Reteta nu poate fi achizitionata");
        }
    }
}
