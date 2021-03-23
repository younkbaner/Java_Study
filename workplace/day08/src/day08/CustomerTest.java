package day08;



public class CustomerTest {
	public static void main(String[] args) {
		Customer cust1=new Customer();
		
		cust1.eat();
		
		cust1.sleep(8);
	}

}

 class Customer{
	 
	 //属性
	String name;
	int age;
	boolean isMale;
	
	//方法
	public void eat() {
		System.out.println("客户吃饭");
		return;
	}
	public void sleep(int hour) {
		System.out.println("客户休息了"+hour+"个小时");
		
		eat();
	}
	public String getation(String nation) {
		String info="我的国际是:"+"nation";
		return info;
	}
	
	
}
