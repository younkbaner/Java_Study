package day102;

public class PersonTest {
	public static void main(String[] args) {
		Person p1=new Person();
		
		p1.setAge(1);
		System.out.println(p1.getAge());
		
		
		
		Person p2 = new Person("Jerry",20);
		System.out.println(p2.getAge());
	}

}

class Person{
	
	//属性(成员变量)
	private String name;
	private int age;
	
	
	//方法
	//此时,调用setName方法传入的形参名和对象的属性名相同,无法区分怎么属性名
	//和形参名.以至于设置失败,如果使用this.属性就可以区分形参名和对象的属性名
	public void setName(String name) {
		//属性名是name,形参名也是name
		//name=name;
		//this可以理解为当前对象,或者正在创建的对象,
		//哪个对象调用,就是指那个对象的属性
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	
	
	//构造方法
	public Person() {
		//this.eat();
	
		System.out.println("执行了Person()");
	}
	
	public Person(String name) {
		this();
		this.name=name;
		System.out.println("执行了Person(String name)");
	}
	
	public Person(int age) {
		this();
		System.out.println("执行了Person(int age)");
		this.age=age;
	}
	
	public Person(String name,int age) {
		this(age);
		System.out.println("执行了Person(String name,int age)");
		this.name=name;
	}
	
}
