public class Person2{
	
	//定义两个成员变量
	 String name;
	 int age;
	//定义一个成员方法
	void say(String content)
	{
		System.out.println(content);
	}
	
	public static void main(String[] args){
	
	//定义Person类型的变量(两种方法)
	//也可以使用 Person p;  p=new Person();
	//定义Person类型的变量时,可以使用 var p=new Person();
	//自动类型推断,更加简洁,可读性更高
	//Person p=new Person();
	var p=new Person2();
	
	//访问p的name实例变量
	p.name="李刚";
	
	p.say(p.name);
	p.say("测试一下向方法传参数");
	}
		
	
}