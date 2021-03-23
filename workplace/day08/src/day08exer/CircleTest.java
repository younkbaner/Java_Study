package day08exer;

public class CircleTest {

	public static void main(String[] args) {
		Circle c=new Circle();
		c.radius=4;
		
		double area=c.findArea();
		System.out.println(area);
		
	}
}


class Circle{
	double radius;
	
	public double findArea() {
		return radius*3.14*3.14;
	}
}