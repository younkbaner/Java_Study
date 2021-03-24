package day09;

public class OverLoad {
public static void main(String[] args) {
	OverLoadTest test=new OverLoadTest();
	
	test.getSum(1,2);
	
	test.getSum(1,"s");
	
	test.getSum("h",2);
	
	test.getSum(1.1,2);
	
	test.getSum(1,2.2);
	
	test.getSum(1.1,2.2);
}
}
