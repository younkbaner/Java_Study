package day09;

public class MethodArgsTest {
public static void main(String[] args) {
	MethodArgs ma=new MethodArgs();
	
	ma.show(8);
	ma.show("你好");
	
	ma.show("a","b","c");
}
}



class  MethodArgs{
	
	
	public void show(int i) {
		System.out.println(i);
		
	}
	
	public void show(String s) {
		System.out.println("show(String)");
	}
	
	public void show(String ...strs) {
		System.out.println("String ...strs");
		
		for(int i=0;i<strs.length;i++) {
			System.out.println(strs[i]);
		}
	}
}