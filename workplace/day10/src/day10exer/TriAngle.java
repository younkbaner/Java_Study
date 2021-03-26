package day10exer;

/*
 * 练习9
 * 
 */

public class TriAngle {
	
	//声明属性
	private  double base;
	private double height;
	
	//设置base属性
	public void setBase(double i) {
		base=i;
	}
	//获得base属性
	public double getBase() {
		return base;
	}
	
	//设置height属性
	public void setHeight(double j) {
		height=j;
	}
	//获得height属性
	public double getHeight() {
		return height;
	}
	
	
	//无参构造器
	public TriAngle() {
		
	}
	
	//有参构造器
	public TriAngle(double i,double j) {
		base=i;
		height=j;
	}
	
	
}
