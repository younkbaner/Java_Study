/*
同在一个类中的成员方法访问成员变量时,可以直接访问 变量,不需要再用:引用变量.成员变量
调用方法的时候需要用:引用变量.成员方法(p.show   p.setX  p.setY)
*/


public class Point{
	
			int x;  //定义横坐标
			int y;  //定义纵坐标
			
	public static void main(String[] args){
		
		//声明Point类的引用
		Point p=new Point();
		//打印成员变量的值
		//System.out.println("p.x="+x+",p.y="+y);
		//减少代码重复量,调用成员方法打印
		p.show();
		
		//修改横纵坐标的值
		p.x=3;
		p.y=4;
		
		
		//System.out.println("p.x="+x+",p.y="+y);
		//调用成员方法打印
		System.out.println("方法内修改成员变量的值>");
		p.show();
		
		//调用成员方法来实现成员变量的修改;
		System.out.println("调用方法分别修改成员变量的值>");
		p.setX(99);
		p.setY(88);
		p.show();
		
		//调用成员方法来实现成员变量的修改;
		System.out.println("调用方法同时修改成员变量的值>");
		p.setXY(234,234);
		p.show();
		
		System.out.println("-------------------");
		p.showArguement();
		p.showArguement("参数1");
		p.showArguement("参数一","参数2");
	}
	
	
	//自定义成员方法show
	void show(){
		System.out.println("p.x="+x+",p.y="+y);
	}
	
	//自定义成员方法实现修改横坐标的值
	void setX(int s){
		x=s;
	}
	
	//自定义成员方法实现修改纵坐标的值
	void setY(int a){
		y=a;
		
	}
	
	//自定义成员方法实现修改纵坐标和纵坐标的值
	void setXY(int q,int w){
		x=q;
		y=w;
	}
	
	void showArguement(String... args){
		System.out.println("你好");
		for(int i=0;i<args.length;i++){
			System.out.println("第"+(i+1)+"个参数为:"+args[i]);
		}
	}
}