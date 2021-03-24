package day09;

public class OverLoadTest {
	
	public void getSum(int i,int j) {
		System.out.println(i+j);
	}
	
	public void getSum(int i,double j) {
		System.out.println(i+j);
	}
	
	public void getSum(double i,double j) {
		System.out.println(i+j);
	}
	
	public void getSum(int i,String s) {
		System.out.println("右字符");
	}
	
	public void getSum(String s ,int i){
		System.out.println("左字符");
	}
	
//如下的3个方法不能与上述方法构成重载,达不到构成形参的条件"两同一不同"
//形参相同,方法名相同,返回值类型不同
//public int getSum(int i,int j){
//return 0;
//}

//方法名相同,形参类型和个数相同,但形参名不同
//public void getSum(int m,int n){
//	
//}
//方法名的修饰符不同
//private void getSum(int i,int j){
//	
//}

}


