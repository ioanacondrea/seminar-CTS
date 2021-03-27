package cts.prototype;

public class Main {

	public static void main(String[] args) {
		Client client1 = new Client("Marcel", 23);
		Bilet bilet = new Bilet(1, "e1", "e2");
		Bilet b2 = (Bilet) bilet.cloneaza();
		b2.setCod(34);
		
		System.out.println(bilet.toString());
		System.out.println(b2.toString());
		Client client2 = (Client) client1.cloneaza();
		System.out.println(client1);
		System.out.println(client2);
	}

}
