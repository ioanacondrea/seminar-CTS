package cts.factory.method;

public class FactoryPortar implements Factory{

	@Override
	public Jucator getJucator(String numeJucator) {
		return new Portar(numeJucator);
	}

}
