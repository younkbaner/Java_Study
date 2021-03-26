package day10;

public class PersonTest {
	public static void main(String[] args) {
		Person p=new Person();
		
		Person p1=new Person("Tom");
		System.out.println(p1.name+"\t"+p1.age);
		
		Person p2=new Person("文中",22);
		System.out.println(p2.name+"\t"+p2.age);
		
		
	}

}

class Person{
	
	//属性
	String name;
	int age;
	
	//方法
	public void eat() {
		System.out.println("人可以吃饭");
	}
	
	public void study() {
		System.out.println("人可以学习");
	}
	
	//构造器
	//无参构造器
	public Person() {
		System.out.println("......>.....>....");
	}
	//有参构造器
	public Person(String n,int a) {
		name=n;
		age=a;
	}
	//有参构造器
	public Person(String n) {
		name=n;
	}
}
