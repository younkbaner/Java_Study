package day08exer;

public class PersonTest {
	public static void main(String[] args) {
	
		Person p=new Person();
		
		p.name="Tom";
		p.age=19;
		p.sex=1;
		
		p.study();
		
		p.showAge();
		
		int newAge=p.addAge(5);
		System.out.println(newAge);
 }
}
