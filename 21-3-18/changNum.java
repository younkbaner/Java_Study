/*

�ɱ䳤������ʹ��



*/



public class changeNum{
	
	int x;
    int y;
	
	public static void main(String[] args){
		changeNum p=new changeNum();
		p.showArguement(0);
		System.out.println("-----------------");
		p.showArguement(1,"����1:");
		System.out.println("-----------------");
		p.showArguement(2,"����1:","����2");
	}
	
	
	void showArguement(int num,String args){
		
		System.out.println("num"+num);
		for(int i=0;i<args.lngth;i++){
			System.out.println("��"+(i+1)+"����Ϊ:"+args[i]);
		}
	}
}