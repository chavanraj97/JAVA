package emppack;

public class Employee {
	private String name;
	private String desig;
	private double salary;
	public Employee() {
		this.name = null;
		this.desig = null;
	}
	public Employee(String name, String desig, double salary) {
		this.name = name;
		this.desig = desig;
		this.salary = salary;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesig() {
		return desig;
	}
	public void setDesig(String desig) {
		this.desig = desig;
	}
};
