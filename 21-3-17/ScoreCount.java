/*
ͳ�ư༶ѧ���ķ���,
*/

import java.util.Scanner;
import java.util.Arrays;

public class ScoreCount{

	public static void main(String[] args){
		//��ʾ����༶����,��ʹ�ñ�����¼
		Scanner InPut=new Scanner(System.in);
		 int number=InPut.nextInt();
		 
		 //����ѧ����������һ����Ӧ���ȵ���������¼ѧ������;
		 double[] score=new double[number];
		 
		 //��ʾ����ÿ��ѧ���ĳɼ�����¼
		 for(int i=0;i<number;i++)
		 {
			 System.out.println("�������"+i+"��ѧ���ķ���:>");
			 score[i]=InPut.nextInt();
		 }
		 
		 
		 //��ӡ����ѧ���Ŀ��Գɼ�
		 System.out.println("�༶��������:");
		 System.out.println(Arrays.toString(score));
		 
		 //���㱾��ѧ�����ֲܷ���ӡ
		 double total=0;
		  for(int i=0;i<number;i++)
		  {
			  total+=score[i];
		  }
		  System.out.println("ѧ���ܷ���:"+total);
		//����ѧ��Ʒ����
		double average=total/number;
		  System.out.println("ѧ��ƽ������:"+average);
		 //���ұ���ѧ������߷ֺ���ͷ�
		 Arrays.sort(score);
		  System.out.println("ѧ����߷���:"+score[number-1]);
		  System.out.println("ѧ����ͷ���:"+score[0]);
		 
		 //�������в���ָ����������λ��
		 System.out.println("������Ҫ���ҵĳɼ�:>");
		 double num=InPut.nextInt();
		 
		 int index=Arrays.binarySearch(score,num);
		 if(index>0){
			 System.out.println(num+"���ڵ�"+index+"λ");
		 }else{
			 System.out.println(num+"����û�ҵ�");
		 }
		 
	}
}