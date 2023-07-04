package java_exercises;

public class Employee {

	private String name;
	private String jobTitle;
	private double salary;
	public Employee(String name, String jobTitle, double salary) {
		this.name = name;
		this.jobTitle = jobTitle;
		this.salary = salary;
	}
	public String getName() {
		return this.name;
	}
	public String getJobTitle() {
		return this.jobTitle;
	}
	public double getSalary() {
		return this.salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
}
