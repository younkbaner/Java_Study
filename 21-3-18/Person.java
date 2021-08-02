
public class Person{
	
	String name;
	int age;
	int ID;
	
	public static void main(String[] args){
		Person p=new Person();
		
		//System.out.println("我是"+name+",今年"+age+"岁了");
		p.show();
		p.name="文中";
		p.age=23;
		//System.out.println("我是"+name+",今年"+age+"岁了");
		p.show();
	}
	
	void show(){
		System.out.println("我是" + name + "，今年" + age + "岁了！");
	}
		
	void show2(){
		System.out.println("我是" + name + "，今年" + age + "岁了！");
	}
}
