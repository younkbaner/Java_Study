package day08exer;

public class Exer3Test {
	public static void main(String[] args) {
		Exer3 eg=new Exer3();
		//eg.method1();
		
		//int area=eg.method2();
		//System.out.println("面积是:"+area);
		
		int area=eg.method3(10,8);
		System.out.println("面积是:"+area);
	}

}


class Exer3{
	
	//3.1
	public void method1() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<8;j++) {
				System.out.print("* ");
			}
			System.out.println();
			}
	}
	
	//3.2
	public int method2() {
		for(int i=0;i<10;i++) {
			for(int j=0;j<8;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		return 10*8;
	}
	
	//3.3
	public int method3(int m,int n) {
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		return m*n;
	}
}
