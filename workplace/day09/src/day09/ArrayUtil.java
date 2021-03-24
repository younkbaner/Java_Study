package day09;


public class ArrayUtil{
		
		// 求数组的最大值
		public int getMax(int[] arr) {
			
			int maxValue=arr[0];
			for(int i=1;i<arr.length;i++) {
				if(arr[i]>maxValue)
					maxValue=arr[i];
			}
			return maxValue;
		}
		
		// 求数组的最小值
		public int getMin(int[] arr) {
			int minValue=arr[0];
			for(int i=0;i<arr.length;i++) {
				if(arr[i]<minValue)
					minValue=arr[i];
			}
			return minValue;
		}
		
		
		// 求数组的总和
		public int getSum(int[] arr) {
			int sum=0;
			for(int i=0;i<arr.length;i++) {
				sum+=arr[i];
			}
			return sum;
		}
		
		
		// 求数组的平均值
		public double getAverage(int[] arr) {
			return getSum(arr)/arr.length;
		}
		
		
		// 反转数组
		public void revers(int[] arr) {
			for(int i=0;i<arr.length/2;i++) {
				int temp=arr[i];
				arr[i]=arr[arr.length-i-1];
				arr[arr.length-i-1]=temp;
			}
		}
		
		
		// 复制数组
		
		public int[] copy(int[] arr) {
			int[] arr1=new int[arr.length];
			for(int i=0;i<arr.length;i++) {
				arr1[i]=arr[i];
			}
			return arr1;
		}
		
		// 数组排序
		public void sort(int[] arr) {
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length-i-1;j++) {
					if(arr[j]>arr[j+1]) {
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			
		}
		
		
		// 遍历数组
		public void print(int[] arr) {
			for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i]+"\t");
			}
			System.out.println();
		}
		
		
		// 查找指定元素
		public int getIndex(int[] arr,int x) {
			for(int i=0;i<arr.length;i++) {
				if(arr[i]==x)
					return i+1;
			}
			return -1;
		}

	}


