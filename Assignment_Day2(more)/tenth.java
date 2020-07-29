//Define an interface “Vechicle” with “start()” function . Now derive  classes like “TwoWheeler”, “ThreeWheeler”,”FourWheeler” etc. from “Vehicle” and override “start()” function. Define a class “VDemo” in which  write  main()  function. In the main function create a reference to Vehicle  class referring to any of the sub class. Using this reference, call “start" method.

interface Vehicle {
	void start();
}
class TwoWheeler implements Vehicle {
	public void start() {
		System.out.println("Start TwoWheeler");
	}
}
class ThreeWheeler implements Vehicle {
	public void start() {
		System.out.println("Start ThreeWheeler");
	}
}
class FourWheeler implements Vehicle {
	public void start() {
		System.out.println("Start FourWheeler");
	}
}
public class tenth {
	
	public static void main(String[] args) {
		Vehicle[] v = {new TwoWheeler(), new ThreeWheeler(), new FourWheeler()};
		
		for(int i = 0; i < v.length; i++) {
			v[i].start();
		}
	}
}