
public class Person{
	
	String name;
	int age;
	
	public static void main(String[] args){
		Person p=new Person();
		
		//System.out.println("����"+name+",����"+age+"����");
		p.show();
		p.name="����";
		p.age=23;
		//System.out.println("����"+name+",����"+age+"����");
		p.show();
	}
	
	void show(){
		System.out.println("����" + name + "������" + age + "���ˣ�");
	}
		
		
}