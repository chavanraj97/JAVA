class Vehicle {
	Vehicle(){
		System.out.println("vehicle");
	}
	public void start() {
		System.out.println("inside Vehicle");
	}
}

class FourWheeler extends Vehicle {
	FourWheeler(){
		System.out.println("Fourwheeler");
	}
	public void start() {
		System.out.println("inside Fourwheeler");
	}
}

public class two {
	public static void main(String[] args) {
		Vehicle f1 = new FourWheeler();
		f1.start();
	}
}