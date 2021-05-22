package ro.ase.cts.state;

public class StareEmisa implements Stare{
    @Override
    public void modificaStare(Reteta reteta) {
        if(!(reteta.getStare() instanceof StareEmisa)){
            System.out.println("Reteta a fost emisa.");
            reteta.setStare(new StareEmisa());
        }else{
            System.out.println("Reteta nu poate fi emisa");
        }
    }
}
