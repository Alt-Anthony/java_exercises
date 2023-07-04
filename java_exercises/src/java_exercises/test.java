package java_exercises;

public class test {

	public static void main(String[] args) {
			//Person person = new Person(12,"alpha");
			//System.out.println(person.getAge()+person.getName());
//		Dog dog = new Dog("beta","1");
//		Dog dog2 = new Dog("omega","2");
//		System.out.println(dog.getName()+", "+dog.getBreed());
//		System.out.println(dog2.getName()+", "+dog2.getBreed());
//		dog.setName("beta2");
//		dog.setBreed("2");
//		dog2.setName("omega2");
//		dog2.setBreed("3");
//		System.out.println(dog.getName()+", "+dog.getBreed());
//		System.out.println(dog2.getName()+", "+dog2.getBreed());
//		Rectangle rectangle = new Rectangle(12,2);
//		
//		System.out.println("Area: "+rectangle.area());
//		System.out.println("perimeter: "+rectangle.perimeter());

		Circle circle = new Circle(5);
		System.out.println(circle.getRadius());
		System.out.println(circle.area()+", "+circle.circunferencia());
		circle.setRadius(8);
		System.out.println(circle.getRadius());
		System.out.println(circle.area()+", "+circle.circunferencia());
		
	}

}
