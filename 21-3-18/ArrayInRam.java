/*
		1.����֮�������
			
			���Է���ִ�����b=a֮��,��������bҲָ�������������aָ�������
			(��ʱ��������bָ�������ʧȥ����,�������)
			
			
			�ٴδ�ӡ����b�ĳ��Ⱥ�Ԫ��ֵʱ,������a��һ��
			
			����������b�ĳ��Ⱥ�Ԫ��ֵ�����˱仯,ֻ����������bҲָ��������
			�����ڶ���ʱ���Ⱦ�ȷ����,�����ٷ����仯,ֱ���������������
			
*/

public class ArrayInRam{
	
	public static void main(String[] args){
		
		//������������������a��b;
		int[] a={1,2,3};
		
		var b=new int[4];
		
		//��ӡ����b�ĳ���,  4
		System.out.println("����b�ĳ�����:"+b.length);
		
		
		//��ӡa��b��Ԫ��
		for(int i=0;i<a.length;i++){
			System.out.println(a[i]);
		}
		
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		
		//ִ��b=a;������b������ָ��������a
		//�ٴδ�ӡ����b�ĳ��Ⱥ�Ԫ��ֵ.
		b=a;
		System.out.println("����b�ĳ�����:"+b.length);
		for(int i=0;i<b.length;i++){
			System.out.println(b[i]);
		}
		
		
		
		
		
	}
	
}