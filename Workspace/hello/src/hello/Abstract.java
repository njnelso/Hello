package hello;
// Working with Abstract classes
public class Abstract {

	public static void main(String[] args) {
		// 'Shape shape = new Shape();' Will not compile

	}

}

abstract class Shape {
	abstract double area();
}

class Triangle extends Shape {
	double area() {
		return 0;
	}
}

class Square extends Shape {
	double area() {
		return 10;
	}
}