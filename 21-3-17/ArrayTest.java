/*

�����г����������ʹ��

*/
import java.util.Arrays;
import java.util.Scanner;
public class ArrayTest{

	public static void main(String[] args){
	
	int[] arr1;
	arr1=new int[]{1,2,3,4,5};
	System.out.println("����arr1�е�Ԫ����");
	System.out.println(Arrays.toString(arr1));//toString�����ӡ������
	System.out.println("**************************************");
	int[] arr2=new int[5];
	for(int i=0;i<5;i++)
	{
		arr2[i]=i;
	}
	System.out.println("����arr2�е�Ԫ����");
	System.out.println(Arrays.toString(arr2));
	System.out.println("**************************************");
	int[] arr3=new int[5];
	System.out.println(Arrays.toString(arr3));
	Arrays.fill(arr3,88);
	System.out.println(Arrays.toString(arr3));//fill������乤����
	System.out.println("**************************************");
	int[] arr4;
	arr4=new int[]{88,88,88,88,88};
	
	boolean isEquals=(Arrays.equals(arr3,arr4));//equals����ȽϹ�����
	System.out.println("����arr3��arr4�Ƿ���ȣ�"+isEquals);
	System.out.println("**************************************");
	int[] arr5=new int[5];
	Scanner sc=new Scanner(System.in);
	System.out.println("����������arr5�е�Ԫ�أ�>");
	for(int i=0;i<5;i++)
	{
		arr5[i]=sc.nextInt();
	}
	System.out.println("����arr5�е�Ԫ���У�");
	System.out.println(Arrays.toString(arr5));
	System.out.println("arr5������ǣ�");
	Arrays.sort(arr5);							//Arrays.sort() �������򹤾��࣬�����򣩣�
	System.out.println(Arrays.toString(arr5));
	
	
	
	
	}
}