package day08;

public class UserTest{
	public static void main(String[] args) {
		User u1=new User();
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.isMale);
		
		u1.talk("中国话");
		u1.eat();
	}
}

class User{
	//属性（或成员变量）
	String name;
	public int age;
	boolean isMale;
	
	
	public void talk(String language){//language:形参，也是局部变量
		System.out.println("我们使用" + language + "进行交流");
		
	}
	
	public void eat(){
		String food = "烙饼";//局部变量
		System.out.println("北方人喜欢吃：" + food);
	}
	
}