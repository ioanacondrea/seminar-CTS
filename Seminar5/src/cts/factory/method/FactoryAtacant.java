package cts.factory.method;

public class FactoryAtacant implements Factory{

	@Override
	public Jucator getJucator(String numeJucator) {
		return new Atacant(numeJucator);
	}

}
