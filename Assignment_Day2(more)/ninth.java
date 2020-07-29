//Define a class “Shape” with “draw()” function . Now derive  classes like “Circle”, “Polygon”,”Rectangle” etc. from “Shape” and override “draw()” function. Define a class “ShapeDemo” in which  write  main()  function. In the main function create a reference to Shape class referring to any of the sub class. Using this reference, call “draw()” and check the result.

class Shape {
	void draw() {
		System.out.println("inside Shape class");
	}
}
class Circle extends Shape {
	void draw() {
		System.out.println("draw Circle");
	}
}
class Polygon extends Shape {
	void draw() {
		System.out.println("draw Polygon");
	}
}
class Rectangle extends Shape {
	void draw() {
		System.out.println("draw Rectangle");
	}
}
public class ninth {
	
	public static void main(String[] args) {
		Shape[] s1 = {new Circle() , new Polygon(), new Rectangle()};
		
		s1[0].draw();
		s1[1].draw();
		s1[2].draw();
	}
}