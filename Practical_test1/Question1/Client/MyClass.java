package devPack;

import emppack.Employee;

public class MyClass {
	public static void main(String[] args) {
		Employee e1 = new Employee();
		e1.setSalary(222.22);
		System.out.println(e1.getSalary());
		e1.setName("Raj");
		System.out.println(e1.getName());
		e1.setDesig("CEO");
		
		
		Employee e2 = new Employee("Nikhil", "Developer", 20000);
		System.out.println(e2.getSalary());
		System.out.println(e2.getDesig());
		System.out.println(e2.getName());
	}
}
