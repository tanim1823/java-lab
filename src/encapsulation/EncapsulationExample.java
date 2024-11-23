package encapsulation;
class Person {
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public void display() {
		 System.out.println("Name: " + this.name);
	     System.out.println("Age: " + this.age);
	}
	
}
public class EncapsulationExample {

	public static void main(String[] args) {
		Person p1 = new Person();

		p1.setName("Tanim");
		p1.setAge(23);
		
		System.out.println("Name : " + p1.getName());
		System.out.println("Age  : "+p1.getAge());

	}

}
