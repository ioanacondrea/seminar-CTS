package cts.factory.method;


public class Mijlocas extends Jucator{

	public Mijlocas(String numeJucator) {
		super(numeJucator);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Mijlocas []").append(super.toString());
		return builder.toString();
	}

}
