package day08exer;

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
		
		//遍历学生数组
		for(int i=0;i<stu.length;i++) {
			System.out.println(stu[i].info());
		}
		
		System.out.println("***********************");
		//问题1:打印年级为3的学生的信息
		for(int i=0;i<stu.length;i++) {
			if(stu[i].state==3) {
				System.out.println(stu[i].info());
			}
		}
		
		System.out.println("***********************");
		
		//问题二:使用冒泡排序,按学生的成绩进行排序,并遍历学生信息
		
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
		for(int i=0;i<stu.length;i++) {
			System.out.println(stu[i].info());
		}
	}

}


class Exer34{
	int number;
	int state;
	int score;
	
	public String info() {
		return "学号:"+number+",年级:"+state+",成绩:"+score;
	}
}
