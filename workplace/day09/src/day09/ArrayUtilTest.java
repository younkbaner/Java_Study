package day09;

public class ArrayUtilTest{
	
	public static void main(String[] args) {
		
		ArrayUtil util = new ArrayUtil();
		
		int[] arr=new int[] {32,34,32,5,3,54,654,-98};
		
		
		//遍历数组
		util.print(arr);
		
		System.out.println("数组的最大值是:"+util.getMax(arr));
		
		System.out.println("数组的最小值是:"+util.getMin(arr));
		
		System.out.println("数组的综合是:"+util.getSum(arr));
		
		System.out.println("数组的平均值是:"+util.getAverage(arr));
		
		//翻转数组
		util.revers(arr);
		
		//遍历数组
		util.print(arr);
				
		//数组排序
		util.sort(arr);
		
		//遍历数组
		util.print(arr);
		
		int index=0;
		index=util.getIndex(arr, 5);
		if(index>=0) {
			System.out.println("第"+index+"位");
		}else {
			System.out.println("没找到");
		}
			
		
		
		
	}
}