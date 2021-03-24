package day09;

public class PassObject {
	
	public static void main(String[] args) {
		Circle c=new Circle();
		
		PassObject test = new PassObject();
		
		test.PrintAreas(c,5);
		
		System.out.println("Now radius is :"+c.radius);
		
	}
	
	public  void PrintAreas(Circle c,int time) {
		System.out.println("Radius\t\tArea");
		int i=1;
		for(;i<=time;i++) {
			c.radius=i;
			double area=c.findArea();
			System.out.println(c.radius+"\t\t"+area);
		}
		c.radius=i;
	}

}
