/*
    ���ʹ�ö�ά������ʵ��������ǵ����ɺͱ���
 */

import java.util.Scanner; 
 
public class ArrayArrayTriangleTest {
	
	public static void main(String[] args) {
		
		// 1.��ʾ�û�����һ��������ʹ�ñ�����¼
		System.out.println("������һ��������");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		// 2.�����û������������������Ӧ�Ķ�ά����
		int[][] arr = new int[num][];
		
		// 3.��Զ�ά�����е�ÿ��Ԫ�ؽ��г�ʼ����ʹ��˫��forѭ��
		// ʹ�����forѭ�����ƶ�ά��������±�
		for(int i = 0; i < num; i++) {
			// ��Զ�ά�����е�ÿһ�н����ڴ�ռ������
			arr[i] = new int[i+1];
			// ʹ���ڲ�forѭ�����ƶ�ά��������±�
			for(int j = 0; j <= i; j++) {
				// �����±�Ϊ0�������±��뵱ǰ�е����±����ʱ�����Ӧλ�õ�Ԫ�ؾ���1
				if(0 == j || i == j) {
					arr[i][j] = 1;
				} else {
					// �����Ӧλ�õ�Ԫ�ؾ�����һ�е�ǰ�е�Ԫ�ؼ�����һ��ǰһ�е�Ԫ��
					arr[i][j] = arr[i-1][j] + arr[i-1][j-1];
				}
			}
		}
		
		// 4.��ӡ�������ɵĽ��
		for(int i = 0; i < num; i++) {
			for(int j = 0; j <= i; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}
}