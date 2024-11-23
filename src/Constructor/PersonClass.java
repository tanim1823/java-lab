package Constructor;


class Person{
	String name;
	int age;
	public Person(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	public void display() {
		 System.out.println("Name: " + this.name);
	     System.out.println("Age: " + this.age);
	}
}

public class PersonClass {
	public static  void  main(String[] arg) {
		Person p1 = new Person("Tanim", 23);
		p1.display();
	}
}
