package cts.seminar.classes;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
	private Zookeeper zookeeper;
	private List<Animal> animale;
	
	
	
	public Zoo() {
		super();
		this.zookeeper = new Zookeeper("Ionel");
		this.animale = new ArrayList();
	}
	public Zoo(Zookeeper zookeeper, List<Animal> animale) {
		super();
		this.zookeeper = zookeeper;
		this.animale = animale;
	}
	public Zookeeper getZookeeper() {
		return zookeeper;
	}
	public void setZookeeper(Zookeeper zookeeper) {
		this.zookeeper = zookeeper;
	}
	public List<Animal> getAnimale() {
		return animale;
	}
	public void setAnimale(List<Animal> animale) {
		this.animale = animale;
	}
	
	public void addAnimal(Animal a) {
		this.animale.add(a);
	}
	
	public void feedAnimals() {
		for(Animal a:  animale) {
			zookeeper.feed(a);
		}
	}

}
