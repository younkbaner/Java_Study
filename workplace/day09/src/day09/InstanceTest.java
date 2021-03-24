package day09;

public class InstanceTest {
	public static void main(String[] args) {
		
		//正常对象的使用
		Phone p=new Phone();
		System.out.println(p);
		p.sendEmail();
		p.playGame();
		
		
		//匿名对象
		//创建了一个对象,但是没有赋值给一个变量名.就是匿名对象
		//之所以给类Phone的属性赋值了1999,调用方法时输出的确是0.0
		//因为赋值的对象和调用属性的对象不是一个对象
		new Phone().price=1999;
		new Phone().showPrice();
		System.out.println("**********");
		PhoneMall mall=new PhoneMall();
		//匿名对象的使用.
		mall.show(new Phone());
	}

}


class PhoneMall{
	
	public void show(Phone phone) {
		phone.sendEmail();
		phone.playGame();
	}
}




class Phone{
	double price;
	
	public void sendEmail() {
		System.out.println("发邮件");
	}
	
	public void playGame() {
		System.out.println("玩游戏");
	}
	
	public void showPrice() {
		System.out.println("手机价格为"+price);
	}
}