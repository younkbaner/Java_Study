package day10exer;


/*
 * 练习9
 * 
 */
public class TriAngleTest {
	public static void main(String[] args) {
		TriAngle ta=new TriAngle();
		ta.setBase(5.5);
		ta.setHeight(4.2);
		System.out.println("ta.base:"+ta.getBase()+",ta.height:"+ta.getHeight());
	
		
		TriAngle tb=new TriAngle(9.9,9.9);
		System.out.println("tb.base:"+tb.getBase()+",tb.height:"+tb.getHeight());
	}
}
