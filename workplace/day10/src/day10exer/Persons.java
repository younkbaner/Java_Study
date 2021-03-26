package day10exer;

public class Persons {
	
	private int age;
	
	public void setAge(int i) {
		if(i>0&&i<130) {
			age=-1;
		}else {
			age=i;
		}
	}
	
	public int getAge() {
		return age;
	}

}
