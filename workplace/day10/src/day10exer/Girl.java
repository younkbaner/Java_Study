package day10exer;

public class Girl {
	//成员变量
	private String name;
	private int age;
	
	//构造器
	public Girl(String name,int age) {
		this.name=name;
		this.age=age;
	}
	public Girl() {
		
	}
	public Girl(String name) {
		this.name=name;
	}
	public Girl(int age) {
		this.age=age;
	}
	
	//成员方法
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public int getAge() {
		return age;
	}
	public void marry(Boy boy) {
		System.out.println("我想嫁给"+boy.getName());
		boy.marry(this);
	}
	public int compare(Girl girl) {
		if(this.age>girl.getAge()) {
			return 1;
		}else if(this.age<girl.getAge()) {
			return -1;
		}else {
			return 0;
		}
	}
	
}
