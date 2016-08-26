public class PetShopTestDrive {

	public static void main(String[] args) {
		
		GoodDog d1 = new GoodDog();
		d1.makeNoise();
		d1.roam();
		d1.Animal();
		//String className = d1.getClass();
		
		
		//Animal a1 = new Animal();

	}

}

abstract class Animal {
	String picture;
	String food;
	String boundaries;
	String location;
	
	public void makeNoise () {
		System.out.println("Animal making Noise");
	}
	
	public void eat () {
		System.out.println("Animal eating");
	}
	
	public void sleep() {
		System.out.println("Animal Sleeping");
	}
	
	public void roam () {
		System.out.println("Animal Roaming");
	}
	
	public void Animal () {
		System.out.println("Animal Method of Class Animal");
	}
	
	public Animal () {
		System.out.println("Constructor of Class Animal");
	}
}

class Feline extends Animal {
	
	public void roam () {
		System.out.println("Feline Roaming");
	}
	
	public Feline (){
		super();
		int i = 7;
		
		
	}
	
}

class Canine extends Animal {
	
	public void roam () {
		System.out.println("Feline Roaming");
	}
	
	public void sick () {
		System.out.println("I am sick, take me to doctor");
	}
	
}

class Hippo extends Animal {
	
	public void makeNoise () {
		System.out.println("Hippo making noise");
	}
	
	public void eat () {
		System.out.println("Hippo eating");
	}
		
}

class Lion extends Feline {
	
	public void makeNoise () {
		System.out.println("Lion making noise");
	}
	
	public void eat () {
		System.out.println("Lion eating");
	}
		
}

class Tiger extends Feline {
	
	public void makeNoise () {
		System.out.println("Tiger making noise");
	}
	
	public void eat () {
		System.out.println("Tiger eating");
	}
		
}

class Cat extends Feline {
	
	public void makeNoise () {
		System.out.println("Cat making noise");
	}
	
	public void eat () {
		System.out.println("Cat eating");
	}
		
}

class Wolf extends Canine {
	
	public void makeNoise () {
		System.out.println("Wolf making noise");
	}
	
	public void eat () {
		System.out.println("Wolf eating");
	}
		
}

class GoodDog extends Canine implements Pet{
	
	public void makeNoise () {
		System.out.println("Dog making noise");
	}
	
	public void eat () {
		System.out.println("Dog eating");
	}
	
	public void beFriendly() {
		System.out.println("Dog Friendly");
	}
	
	public void play() {
		System.out.println("Dog Playing");
	}
	
	public void roam() {
		super.roam();
		System.out.println("Dog Roaming");
		super.sick();
	}
		
}

interface Pet extends FamilyMember {
	public abstract void beFriendly ();
	
	public abstract void play();
	
}

interface FamilyMember {
	public abstract void roam();
	public abstract void sick();
}