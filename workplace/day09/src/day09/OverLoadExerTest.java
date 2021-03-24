package day09;

/*
 *  练习4 
 */


public class OverLoadExerTest {
	public static void main(String[] args) {
		OverLoadExer ol=new OverLoadExer();
		
		ol.mOL(5);
		
		ol.mOL(3, 5);
		
		ol.mOL("Hello,World");
		
		ol.max(2,99);
		
		ol.max(19.9, 1.1);
		
		ol.max(3.3, 6.6, 9.9);
	}

}


class OverLoadExer{
	
	//一下三个方法构成重载
	public void mOL(int i) {
		System.out.println(i*i);
	}
	
	public void mOL(int i,int j) {
		System.out.println(i*j);
	}
	
	public void mOL(String str) {
		System.out.println(str);
	}
	
	//一下三个方法构成另外一个重载
	
	public void max(int i,int j) {
		System.out.println((i>j)?i:j); 
	}
	
	public void max(double i,double j) {
		System.out.println((i>j)?i:j); 
	}
	
	public void max(double q,double w,double e) {
		double max=(q>w)?q:w;
		System.out.println((max>e)?max:e);
	}
}
