package day08exer;

public class StudentTest {
	public static void main(String[] args) {
		Student st1=new Student();
		st1.say();
	}
}

class Student{
	String name="杨文中";
	int age=23;
	String major="IOT";
	String interests="code";
	
	public void say() {
		System.out.println("我是"+name+",今年"+age+"岁了,我的专业是"
				+major+",我的兴趣是"+interests);
	}
}
