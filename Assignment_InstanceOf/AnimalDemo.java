class Animal {
	void makeSound() {
		System.out.println("animal sound");
	}
};
class Dog extends Animal {
	void makeSound() {
		System.out.println("Dog's Woof");
	}
};
class Cat extends Animal {
	void makeSound() {
		System.out.println("Cat's Meow");
	}
};
class Tiger extends Animal {
	void makeSound() {
		System.out.println("Lion's Roar");
	}
	void hunting() {
		System.out.println("Kill");
	}
};
public class AnimalDemo {
	static void perform(Animal ref) {
		if(ref instanceof Tiger) {
			Tiger ref2 = (Tiger) ref;
			ref2.hunting();
		}
		ref.makeSound();
	}
	public static void main(String[] args) {
		perform(new Tiger());
		perform(new Cat());
		perform(new Dog());
	}
	
}