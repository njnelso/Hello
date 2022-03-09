package hello;

public class Scopes {

	public static void main(String[] args) {
		Person one = new Person();
		Person two = new Person();
		one.age = 10;
		two.age = 20;
		Person.planet = "Earth";
		System.out.println(one.age);
	}

}

class Person {
	// instance variable
	int age;
	// class variable
	static String planet;
	// local variable
	public void move(int distance) {
		{
			// block-scope variable
			int x = 10;
			distance = 10;
		
		}
		distance = 9;
	}
}