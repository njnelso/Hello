package hello;
//Working with interfaces
public class Interfaces {

	public static void main(String[] args) {
		// Compiler won't work for Drawable a = new Drawable();

	}

}

interface Drawable {
	public abstract void draw(); //Public and abstract are inferred
}

interface Colorable extends Drawable {
	void color();
}

class Rectangle implements Drawable, Runnable {
	public void draw() {}
	public void run() {}
}

class Circle implements Colorable {
	public void color() {}
	public void draw() {}
}