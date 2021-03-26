package day10;

public class AnimalTest {
public static void main(String[] args) {
	Animal a=new Animal();
	
	a.name="豆豆";
	//没有把age和legs的属性隐藏的时候设置age和legs的办法
	//a.age=5;
	//a.legs=4;
	
	
	//把age和legs隐藏之后,设置age和legs的的办法
	a.setLegs(4);
	a.setAge(5);
	a.show();
	
}
}
/*
 *
 *在Animal类中,把age和legd属性设置成了私有类型(privata修饰),这样再设置这
 *两个属性的时候,就不能在外面设置了,是因为legs和age在Animal类外面是不可见的,
 *只能在Animal类内部设置,或者调用Animal里面生命的setAge和setLegs方法设置
 *同理,在Animal类外面,也不能使用对象名.age和对象名.Legs来访问age和legs属性
 *只能通过getAge和getLegs来获得这两个属性的值
 *
 *通过这种形式就可以把age和legs属性给隐藏起来了
 *只给外界提供相应的设置和获得这两个属性的方法
 */

class Animal{
	String name;
	private int age;
	private int legs;
	
	public void eat() {
		System.out.println("动物吃饭");
	}
	
	public void show() {
		System.out.println("name="+name+",age="+age+",legs="+legs);
	}
	
	//设置legs属性的方法
	public void setLegs(int l) {
		if(l>0&&l%2==0) {
			legs=l;
		}else {
			legs=0;
		}//学完异常之后,此处如果传入的l>0,可以抛出一个异常
	}
	
	//获得legs属性的方法
	public int getLegs() {
		return legs;
	}
	
	//设置age属性的方法
	public void setAge(int i) {
		age =i;
	}
	
	//获得age的方法
	public int getAge() {
		return age;
	}
	
	
	
	
}
