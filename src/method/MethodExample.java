package method;
class Person {
	private String name;
	private int age;
	public Person(String name , int age) {
		this.name= name;
		this.age = age;
	}
	static void nameOfTheClass() {
		System.out.println("Person Class");
	}
	public void personInfo() {
		System.out.println("Name : " + name);
		System.out.println("Age  : " + age);
	}
}
public class MethodExample {
	public static void main(String[] args) {
		Person p1 = new Person("Tanim" , 23);
		Person.nameOfTheClass();
		p1.personInfo();
	}
}
