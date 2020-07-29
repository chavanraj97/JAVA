abstract class Shape {
	abstract void draw();
	
}
class Triangle extends Shape {
	void draw() {
		System.out.println("draw triangle");
	}
}
class Polygon extends Shape {
	void draw() {
		System.out.println("draw Polygon");
	}
}
class Circle extends Shape {
	void draw() {
		System.out.println("draw Circle");
	}
}

public class Fifth {
	public static void main(String[] args) {
		Shape s[] = {new Triangle(), new Polygon() , new Circle()};
		s[0].draw();
		s[1].draw();
		s[2].draw();
	}
	
}