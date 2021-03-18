/*
	演示成员方法之间参数的传递,看形参的改变会不会改变实参的值
	1.传递基本变量类型
		基本变量传入到调用方法中,如果形参被修改,其对应的实参是不变的
		(这是因为基本变量实参传入到调用方法后的形参,实际上是实参的拷贝,在另外一块内存区域上的值,
		所以修改形参是不会改变实参)
	
	2.传递引用变量类型
		引用变量传入到调用方法中,如果形参的值被修改,其对应的实参的值也会被修改
		(这是因为引用型变量实参传入到形参后,并没有在内存中把实参拷贝一份,而是把形参的引用也指向实参的引用
		所以,修改形参的值,就是直接修改内存中实参的值)

*/

public class ArgTransfer{
	
	//声明方法,传入基本变量参数并打印
	void show(int argB){
		System.out.println("传入的形参argB是:"+argB);
		//方法内修改传入的参数
		argB=999;
		
	}
	
	void show2(int[] arr){
		System.out.println("传入数组arr的元素是:>");
		for(var arrs:arr)
		{
			System.out.println(arrs);
		}
		
		//在调用方法中修改传入的数组
		arr[1]=234;
		arr[3]=567;
		
	}
	
	public static void main(String[] args){
		
		ArgTransfer p=new ArgTransfer();
		
		int ab=10;
		
		System.out.println("ab是:"+ab);
		//调用show方法,传入基本类型的变量ab
		p.show(ab);
		System.out.println("实参在形参中修改后,ab="+ab);
		
		System.out.println("******************************");
		
		//定义一个数组
		int[] sarr={1,2,3,4};
		
		System.out.println("数组sarr的元素是:>");
		
		//这是foreach循环,可以在不知道数组长度的情况下遍历打印数组中元素的值
		//如果形参的类型使用 var 定义,就可以自动推断传入数组的类型
		for(var arrs:sarr)
		{
			System.out.println(arrs);
		}
		
		//调用show2方法,传入引用型变量数组arrs
		p.show2(sarr);
		
		
		//测试在调用方法中修改的数组,会不会影响实际数组的元素值
		System.out.println("在调用方法中修改过的数组sarr的元素是:>");
		for(var arrs:sarr)
		{
			System.out.println(arrs);
		}
	}
	
}