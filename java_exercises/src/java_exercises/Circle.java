package java_exercises;

public class Circle {

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;	
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double area(){
		return Math.PI*radius*radius;
	}
	public double circunferencia() {
		return Math.PI*radius*2;
	}
	
}
