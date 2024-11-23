package ConstructorOverloading;

class Person {
    String name;
    int age;

    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}

public class PersonClassOverloading {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("Tanim" , 23);
		System.out.println("\tPerson 1 (Without parameter)");
		p1.display();
		System.out.println("\tPerson 2 (With parameter)");
		p2.display();
		
	}
}
