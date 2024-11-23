package interference;

interface Animal {
	void makeSound();
	void eat();
}

class Dog implements Animal{

	@Override
	public void makeSound() {
		System.out.println("Dog barks");
	}

	@Override
	public void eat() {
		System.out.println("Dog is eating");
	}
	
}

class Cat implements Animal{

	@Override
	public void makeSound() {
		System.out.println("Cat meows");
	}

	@Override
	public void eat() {
		System.out.println("Cat is eating");
	}
	
}

public class InterferenceExample {
	
	public static void main(String[] args) {
		Animal dogAnimal = new Dog();
		Animal catAnimal = new Cat();
		
		dogAnimal.makeSound();
		dogAnimal.eat();
		catAnimal.makeSound();
		catAnimal.eat();
	}

}
