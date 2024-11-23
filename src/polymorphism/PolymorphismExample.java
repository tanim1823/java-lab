package polymorphism;

class Animal{
	String name;
	public void sound() {
        System.out.println("Animal makes a sound");
    }
	
}

class Dog extends Animal{
	@Override
	 public void sound() {
	        System.out.println("Dog barks");
	 }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}

public class PolymorphismExample {

	public static void main(String[] args) {
		Animal animalObj = new Animal(); 
		Animal dogObj = new Dog();
		Animal catObj = new Cat();
		
		animalObj.sound();
		dogObj.sound();
		catObj.sound();

	}

}
