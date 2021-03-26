package day10er;


/*
 * 测试day10包下的Oreder类下default型的属性和方法
 * */


import day10.Order;
public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();

		order.orderPublic = 2;
		// 出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
		//order.orderDefault = 1;//The field Order.orderDefault is not visible
		// order.orderPrivate = 3;//The field Order.orderPrivate is not visible

		
		
		order.methodPublic();
		// 出了Order类所属的包之后，私有的结构、缺省声明的结构就不可以调用了
		//order.methodDefault();//The method methodDefault() from the type Order is not visible
		// order.methodPrivate();//The method methodPrivate() from the type Order is not visible
	}
	
}
