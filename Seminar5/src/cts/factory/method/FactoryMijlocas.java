package cts.factory.method;

public class FactoryMijlocas implements Factory{

	@Override
	public Jucator getJucator(String numeJucator) {
		return new Mijlocas(numeJucator);
	}

}
