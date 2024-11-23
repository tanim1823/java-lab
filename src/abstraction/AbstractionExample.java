package abstraction;

abstract class Animal {
	public abstract void makeSound();
	public void sleep() {
		System.out.println("Sleeping...");
	}
}

class Dog extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}
}

class Cat extends Animal{
	@Override
	public void makeSound() {
		System.out.println("Cat meows");
	}
}



public class AbstractionExample {
	public static void main(String[] args) {
		Animal dog = new Dog();
		Animal cat = new Cat();
		
		dog.makeSound();
		dog.sleep();
		cat.makeSound();
		cat.sleep();

	}

}
