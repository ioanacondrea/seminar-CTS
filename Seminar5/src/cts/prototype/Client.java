package cts.prototype;

public class Client implements Cloner{
	private String nume;
	private int varsta;
	

	public Client() {
		super();
	}
	public Client(String nume, int varsta) {
		super();
		this.nume = nume;
		this.varsta = varsta;
	}
	@Override
	public Cloner cloneaza() {
		Client client =  new Client(); 
		client.nume = this.nume;
		client.varsta = this.varsta;
		
		return client;
	}
	
	
	
}
