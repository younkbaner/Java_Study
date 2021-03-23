package day08;

public class Exer34Test {
	
	public static void main(String[] args) {
		
		//声明Exer34类型的数组
		Exer34[] stu=new Exer34[20];
		
		for(int i=0;i<stu.length;i++) {
			//给数组元素赋值
			stu[i]=new Exer34();
			//给 Exer34对象的属性赋值
			//学号
			stu[i].number=i+1;
			//年级(1-6)
			stu[i].state=(int)(Math.random()*(6-1+1)+1);
			//分数(1-100)
			stu[i].score=(int)(Math.random()*(100-0+1));
		}
		
		Exer34 test=new Exer34();
	
		System.out.println("遍历学生数组>");
		test.print(stu); 
		System.out.println("**************");
		
		//问题一：打印出3年级(state值为3）的学生信息。
		System.out.println("打印出3年级(state值为3）的学生信息>");
		test.searchState(stu, 3);
		System.out.println("**************");
		
		//问题二：使用冒泡排序按学生成绩排序，并遍历所有学生信息
		test.sort(stu);
		
		
		//遍历学生数组
		System.out.println("遍历排序后的学生数组>");
		test.print(stu); 
	

}
}


class Exer34{
	int number;
	int state;
	int score;
	
	public String info() {
		return "学号:"+number+",年级:"+state+",成绩:"+score;
	}
	
	//遍历stu数组的操作
	public void print(Exer34[] stu) {
			for(int i=0;i<stu.length;i++) {
				System.out.println(stu[i].info());
			}
		}
		
	public void searchState(Exer34[] stu,int stat) {
			for(int i=0;i<stu.length;i++) {
				if(stu[i].state==3) {
					System.out.println(stu[i].info());
				}
			}
		}
		
		//对数组进行排序
	public void sort(Exer34[] stu) {
			for(int i=0;i<stu.length-1;i++) {
				for(int j=0;j<stu.length-1-i;j++) {
					if(stu[j].score>stu[j+1].score) {
						//如果需要换序,交换数组元素,而不是Exer34对象的分数
						Exer34 temp=stu[j];
						stu[j]=stu[j+1];
						stu[j+1]=temp;
					}
				}
			}
		}
		
}	

