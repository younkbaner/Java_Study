/*
	��ʾ��Ա����֮������Ĵ���,���βεĸı�᲻��ı�ʵ�ε�ֵ
	1.���ݻ�����������
		�����������뵽���÷�����,����βα��޸�,���Ӧ��ʵ���ǲ����
		(������Ϊ��������ʵ�δ��뵽���÷�������β�,ʵ������ʵ�εĿ���,������һ���ڴ������ϵ�ֵ,
		�����޸��β��ǲ���ı�ʵ��)
	
	2.�������ñ�������
		���ñ������뵽���÷�����,����βε�ֵ���޸�,���Ӧ��ʵ�ε�ֵҲ�ᱻ�޸�
		(������Ϊ�����ͱ���ʵ�δ��뵽�βκ�,��û�����ڴ��а�ʵ�ο���һ��,���ǰ��βε�����Ҳָ��ʵ�ε�����
		����,�޸��βε�ֵ,����ֱ���޸��ڴ���ʵ�ε�ֵ)

*/

public class ArgTransfer{
	
	//��������,�������������������ӡ
	void show(int argB){
		System.out.println("������β�argB��:"+argB);
		//�������޸Ĵ���Ĳ���
		argB=999;
		
	}
	
	void show2(int[] arr){
		System.out.println("��������arr��Ԫ����:>");
		for(var arrs:arr)
		{
			System.out.println(arrs);
		}
		
		//�ڵ��÷������޸Ĵ��������
		arr[1]=234;
		arr[3]=567;
		
	}
	
	public static void main(String[] args){
		
		ArgTransfer p=new ArgTransfer();
		
		int ab=10;
		
		System.out.println("ab��:"+ab);
		//����show����,����������͵ı���ab
		p.show(ab);
		System.out.println("ʵ�����β����޸ĺ�,ab="+ab);
		
		System.out.println("******************************");
		
		//����һ������
		int[] sarr={1,2,3,4};
		
		System.out.println("����sarr��Ԫ����:>");
		
		//����foreachѭ��,�����ڲ�֪�����鳤�ȵ�����±�����ӡ������Ԫ�ص�ֵ
		//����βε�����ʹ�� var ����,�Ϳ����Զ��ƶϴ������������
		for(var arrs:sarr)
		{
			System.out.println(arrs);
		}
		
		//����show2����,���������ͱ�������arrs
		p.show2(sarr);
		
		
		//�����ڵ��÷������޸ĵ�����,�᲻��Ӱ��ʵ�������Ԫ��ֵ
		System.out.println("�ڵ��÷������޸Ĺ�������sarr��Ԫ����:>");
		for(var arrs:sarr)
		{
			System.out.println(arrs);
		}
	}
	
}