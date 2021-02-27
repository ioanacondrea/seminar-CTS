package cts.seminar;

import cts.seminar.classes.Animal;
import cts.seminar.classes.Girafa;
import cts.seminar.classes.Zebra;
import cts.seminar.classes.Zoo;

public class Main {

	public static void main(String[] args) {
		Zoo zoo = new Zoo();
		Animal z1 = new Zebra("Monica");
		Animal z2 = new Zebra("Costel");
		Animal g1 = new Girafa("Mariana");
		Animal g2 = new Girafa("Florica", 500);
		
		zoo.addAnimal(z1);
		zoo.addAnimal(z2);
		zoo.addAnimal(g1);
		zoo.addAnimal(g2);
		
		zoo.feedAnimals();
		zoo.mutareAnimale();
		
	}

}
