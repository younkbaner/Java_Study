/*
ͬ��һ�����еĳ�Ա�������ʳ�Ա����ʱ,����ֱ�ӷ��� ����,����Ҫ����:���ñ���.��Ա����
���÷�����ʱ����Ҫ��:���ñ���.��Ա����(p.show   p.setX  p.setY)
*/


public class Point{
	
			int x;  //���������
			int y;  //����������
			
	public static void main(String[] args){
		
		//����Point�������
		Point p=new Point();
		//��ӡ��Ա������ֵ
		//System.out.println("p.x="+x+",p.y="+y);
		//���ٴ����ظ���,���ó�Ա������ӡ
		p.show();
		
		//�޸ĺ��������ֵ
		p.x=3;
		p.y=4;
		
		
		//System.out.println("p.x="+x+",p.y="+y);
		//���ó�Ա������ӡ
		System.out.println("�������޸ĳ�Ա������ֵ>");
		p.show();
		
		//���ó�Ա������ʵ�ֳ�Ա�������޸�;
		System.out.println("���÷����ֱ��޸ĳ�Ա������ֵ>");
		p.setX(99);
		p.setY(88);
		p.show();
		
		//���ó�Ա������ʵ�ֳ�Ա�������޸�;
		System.out.println("���÷���ͬʱ�޸ĳ�Ա������ֵ>");
		p.setXY(234,234);
		p.show();
		
		System.out.println("-------------------");
		p.showArguement();
		p.showArguement("����1");
		p.showArguement("����һ","����2");
	}
	
	
	//�Զ����Ա����show
	void show(){
		System.out.println("p.x="+x+",p.y="+y);
	}
	
	//�Զ����Ա����ʵ���޸ĺ������ֵ
	void setX(int s){
		x=s;
	}
	
	//�Զ����Ա����ʵ���޸��������ֵ
	void setY(int a){
		y=a;
		
	}
	
	//�Զ����Ա����ʵ���޸���������������ֵ
	void setXY(int q,int w){
		x=q;
		y=w;
	}
	
	void showArguement(String... args){
		System.out.println("���");
		for(int i=0;i<args.length;i++){
			System.out.println("��"+(i+1)+"������Ϊ:"+args[i]);
		}
	}
}