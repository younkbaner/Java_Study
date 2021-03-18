/*
		1.数组之间的引用
			
			可以发现执行语句b=a之后,数组引用b也指向的了数组引用a指向的数组
			(此时数组引用b指向的数组失去引用,编程垃圾)
			
			
			再次打印数组b的长度和元素值时,和数组a的一样
			
			并不是数组b的长度和元素值发生了变化,只是数组引用b也指向了数组
			数组在定义时长度就确定了,不会再发生变化,直到变成垃圾被回收
			
*/

public class ArrayInRam{
	
	public static void main(String[] args){
		
		//首先声明了两个数组a和b;
		int[] a={1,2,3};
		
		var b=new int[4];
		
		//打印数组b的长度,  4
		System.out.println("数组b的长度是:"+b.length);
		
		
		//打印a和b的元素
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		
		//执行b=a;将数组b的引用指向了数组a
		//再次打印数组b的长度和元素值.
		b=a;
		System.out.println("数组b的长度是:"+b.length);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		
		
		
		
		
	}
	
}