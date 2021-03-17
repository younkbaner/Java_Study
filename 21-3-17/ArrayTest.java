/*

数组中常见工具类的使用

*/
import java.util.Arrays;
import java.util.Scanner;
public class ArrayTest{

	public static void main(String[] args){
	
	int[] arr1;
	arr1=new int[]{1,2,3,4,5};
	System.out.println("数组arr1中的元素有");
	System.out.println(Arrays.toString(arr1));//toString数组打印工具类
	System.out.println("**************************************");
	int[] arr2=new int[5];
	for(int i=0;i<5;i++)
	{
		arr2[i]=i;
	}
	System.out.println("数组arr2中的元素有");
	System.out.println(Arrays.toString(arr2));
	System.out.println("**************************************");
	int[] arr3=new int[5];
	System.out.println(Arrays.toString(arr3));
	Arrays.fill(arr3,88);
	System.out.println(Arrays.toString(arr3));//fill数组填充工具类
	System.out.println("**************************************");
	int[] arr4;
	arr4=new int[]{88,88,88,88,88};
	
	boolean isEquals=(Arrays.equals(arr3,arr4));//equals数组比较工具类
	System.out.println("数组arr3和arr4是否相等："+isEquals);
	System.out.println("**************************************");
	int[] arr5=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("请依次输入arr5中的元素：>");
	for(int i=0;i<5;i++)
	{
		arr5[i]=sc.nextInt();
	}
	System.out.println("数组arr5中的元素有：");
	System.out.println(Arrays.toString(arr5));
	System.out.println("arr5排序后是：");
	Arrays.sort(arr5);							//Arrays.sort() 数组排序工具类，（升序）；
	System.out.println(Arrays.toString(arr5));
	
	
	
	
	}
}