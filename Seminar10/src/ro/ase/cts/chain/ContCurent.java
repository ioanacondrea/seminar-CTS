package ro.ase.cts.chain;

public class ContCurent extends Cont{

	public ContCurent(double sold, String iBAN) {
		super(sold, iBAN);
	}

	@Override
	public void plateste(double suma) {
		if(super.getSold()>=suma) {
			super.setSold(super.getSold()- suma);
			System.out.println("S-a realizat plata din contul curent");
		}else {
			if(super.getNext() != null) {
				super.getNext().plateste(suma);
			}else {
				System.out.println("Nu se poate realiza plata");
			}
		}
	}

}
