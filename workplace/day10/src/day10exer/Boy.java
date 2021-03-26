package day10exer;

public class Boy {
	
	//成员变量
	private String name;
	private int age;
	
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
	public void marry(Girl girl) {
		System.out.println("我想娶"+girl.getName());
	}
	public void shout(){
		if(this.age >= 22){
			System.out.println("你可以去合法登记结婚了！");
		}else{
			System.out.println("先多谈谈恋爱~~");
		}
		
	}
	
	//构造器
	public Boy() {
		
	}
	public Boy(String name,int age) {
		this.age=age;
		this.name=name;
	}
	public Boy(String name) {
		this.name=name;
	}
	public Boy(int age) {
		this.age=age;
	}
	
}
