package ro.ase.cts.proxy;

public class ProxyOperatorRezervari implements IOperatorRezervari{
	
	private OperatorRezervari operator;
	private int conditieNrPersoane;
	
	public ProxyOperatorRezervari(OperatorRezervari operator, int conditieNrPersoane) {
		super();
		this.operator = operator;
		this.conditieNrPersoane = conditieNrPersoane;
	}

	@Override
	public void realizeazaRezervare(String numeClient, int nrPersoane) {
		if(nrPersoane >= this.conditieNrPersoane) {
			operator.realizeazaRezervare(numeClient, nrPersoane);
		}else {
			System.out.println("Nu este necesara rezervare.");
		}
		
	}

}
