/*
统计班级学生的分数,
*/

import java.util.Scanner;
import java.util.Arrays;

public class ScoreCount{

	public static void main(String[] args){
		//提示输入班级人数,并使用变量记录
		Scanner InPut=new Scanner(System.in);
		 int number=InPut.nextInt();
		 
		 //根据学生人数声明一个对应长度的数组来记录学生分数;
		 double[] score=new double[number];
		 
		 //提示输入每个学生的成绩并记录
		 for(int i=0;i<number;i++)
		 {
			 System.out.println("请输入第"+i+"个学生的分数:>");
			 score[i]=InPut.nextInt();
		 }
		 
		 
		 //打印所有学生的考试成绩
		 System.out.println("班级分数如下:");
		 System.out.println(Arrays.toString(score));
		 
		 //计算本班学生的总分并打印
		 double total=0;
		  for(int i=0;i<number;i++)
		  {
			  total+=score[i];
		  }
		  System.out.println("学生总分是:"+total);
		//计算学生品均分
		double average=total/number;
		  System.out.println("学生平均分是:"+average);
		 //查找本班学生的最高分和最低分
		 Arrays.sort(score);
		  System.out.println("学生最高分是:"+score[number-1]);
		  System.out.println("学生最低分是:"+score[0]);
		 
		 //从数组中查找指定分数所在位置
		 System.out.println("请输入要查找的成绩:>");
		 double num=InPut.nextInt();
		 
		 int index=Arrays.binarySearch(score,num);
		 if(index>0){
			 System.out.println(num+"分在第"+index+"位");
		 }else{
			 System.out.println(num+"分数没找到");
		 }
		 
	}
}