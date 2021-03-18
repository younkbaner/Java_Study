/*

可变长参数的使用



*/



public class changeNum{
	
	int x;
    int y;
	
	public static void main(String[] args){
		changeNum p=new changeNum();
		p.showArguement(0);
		System.out.println("-----------------");
		p.showArguement(1,"参数1:");
		System.out.println("-----------------");
		p.showArguement(2,"参数1:","参数2");
	}
	
	
	void showArguement(int num,String args){
		
		System.out.println("num"+num);
		for(int i=0;i<args.lngth;i++){
			System.out.println("第"+(i+1)+"参数为:"+args[i]);
		}
	}
}