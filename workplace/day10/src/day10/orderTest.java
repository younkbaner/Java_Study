package day10;

public class orderTest {
public static void main(String[] args) {
	Order order=new Order();
	//order.orderPrivate=1;
	//orderPrivate属性是在Order类内部声明的private,只能在Order类内操作
	//此处就会报错:The field Order.orderPrivate is not visible
	order.orderDefault=2;
	order.orderPublic=3;
	
	
	order.methodDefault();
	order.methodPublic();
	//order.methodPrivate();
	//methodPrivate方法也是Order类内定义的private方法,出了Order类就不能用了
	//The method methodPrivate() from the type Order is not visible
}
}
