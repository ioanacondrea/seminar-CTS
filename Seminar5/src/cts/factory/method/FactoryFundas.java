package cts.factory.method;

public class FactoryFundas implements Factory{

	@Override
	public Jucator getJucator(String numeJucator) {
		return new Fundas(numeJucator);
	}

}
