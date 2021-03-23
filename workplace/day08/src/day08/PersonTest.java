package day08;

//定义一个person类的测试类,
public class PersonTest {
	public static void main(String[] args) {
		
		//创建类的对象/实例化一个类/类的实例化
		Person p1=new Person();
		
		//调用对象的属性和方法
		//对象名.属性
		//对象名.方法
		p1.name="文中";
		p1.isMale=true;
		System.out.println(p1.name);
		p1.eat();
		p1.sleep();
		p1.talk("Chinese");
		
		//*********************
		//对象的属性初始化的值
		Person p2=new Person();
		System.out.println(p2.name);
		System.out.println(p2.isMale);
		
		//*********************
		Person p3=new Person();
		//让p3也指向p1的那块堆内存空间
		p3=p1;
		System.out.println(p3.name);
	}
}

//定义一个person类,设计类的成员
class Person{
	
	String name;
	int age=1;
	boolean isMale;
	
	public void eat() {
		System.out.println("人可以吃饭");
	}
	
	public void sleep() {
		System.out.println("人可以睡觉");
	}
	
	public void talk(String language) {
		System.out.println("人可以说话,用的是"+language+"语言");
	}
}