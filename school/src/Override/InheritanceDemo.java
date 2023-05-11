package Override;

public class InheritanceDemo {
	public static void main(String[] args) {
		Circle c = new Circle();
		Ball b = new Ball("red");
		
		c.findArea();
		b.findArea();
	}
}
