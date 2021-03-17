/*
数组中常用的工具类
2
*/

import java.util.Arrays;

public class ArrayTest2{

public static void main(String[] args){

		int[] arr1=new int[6];
		for(int i=0;i<6;i++){
			arr1[i]=i+21;
		}
		System.out.println("arr1中的元素有:");
		System.out.println(Arrays.toString(arr1));
	
	
		int[] arr2=new int[6];
		System.out.println("arr2中的元素有:");
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("使用arraycopy后");
		System.arraycopy(arr1, 0, arr2, 0,6);
		System.out.println(Arrays.toString(arr2));
		System.out.println("******************************");
		System.out.println("在arr1中查找:23");
		int index=Arrays.binarySearch(arr1,23);
		if(index>0){
			System.out.println("23的索引是:"+index);
		}else{
			System.out.println("23不在arr1中");

		}
		int index2=Arrays.binarySearch(arr1,999);
		if(index2>0){
			System.out.println("999的索引是:"+index2);
		}else{
			System.out.println("999不在arr1中");
		}
}

}
