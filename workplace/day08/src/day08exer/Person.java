package day08exer;

public class Person {
	String name;
	int age;
	/**
	 * 1 男性
	 * 2 女性
	 */
	int sex;
	 
	public void study() {
		System.out.println("studying");
	}
	
	public void showAge() {
		System.out.println(age);
	}
	
	public int addAge(int i) {
		age+=i;
		return age;
	}
}
