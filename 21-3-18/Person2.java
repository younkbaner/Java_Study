public class Person2{
	
	//����������Ա����
	 String name;
	 int age;
	//����һ����Ա����
	void say(String content)
	{
		System.out.println(content);
	}
	
	public static void main(String[] args){
	
	//����Person���͵ı���(���ַ���)
	//Ҳ����ʹ�� Person p;  p=new Person();
	//����Person���͵ı���ʱ,����ʹ�� var p=new Person();
	//�Զ������ƶ�,���Ӽ��,�ɶ��Ը���
	//Person p=new Person();
	var p=new Person2();
	
	//����p��nameʵ������
	p.name="���";
	
	p.say(p.name);
	p.say("����һ���򷽷�������");
	}
		
	
}