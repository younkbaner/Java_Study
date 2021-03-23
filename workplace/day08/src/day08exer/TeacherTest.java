package day08exer;

public class TeacherTest {
	public static void main(String[] args) {
		Teacher tea1=new Teacher();
		tea1.say();
	}

}


class Teacher{
	String name="李永芳";
	int age=22;
	int teachAge=0;
	String course="数学";
	
	void say() {
	System.out.println("大家好,我是"+name+"老师,我今年"+age+"岁了,我已经教学"
			+teachAge+"年了,我带大家"+course+"课");
	}
}