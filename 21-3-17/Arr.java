import java.util.Arrays;
public class Arr{
	public static void main(String[] args){
	
		System.out.println("**********************************");
		int[] arr1;
		arr1=new int[]{11,22,33,44};   //静态初始化
		System.out.println("Arr1的长度是："+arr1.length);
		System.out.println("第2个元素是："+arr1[0]);
		System.out.println("第2个元素是："+arr1[1]);
		System.out.println("**********************************");
		double[] arr2 = new double[5];  //动态初始化
		System.out.println("第2个元素是："+arr2[1]);
		for(int i=0;i<5;i++)
		{
			arr2[i]=99.9;
		}
		System.out.println(Arrays.toString(arr2));
		System.out.println("**********************************");
		int[] arr3;
		arr3=new int[]{99,666,55};
		System.out.println(Arrays.toString(arr3));
		System.out.println("**********************************");
		boolean[] arr4 = new boolean[]{true, true, false, false};
											//静态初始化的另一种方式
		System.out.println(Arrays.toString(arr4));
		System.out.println("**********************************");
		char[] arr5=new char[5];
		arr5[0]='a';
		arr5[1]='b';
		arr5[2]='c';
		arr5[3]='d';
		arr5[4]='e';
		System.out.println(Arrays.toString(arr5));
	}
}