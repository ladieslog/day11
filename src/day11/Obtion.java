package day11;

import java.util.Scanner;

public class Obtion {
	public static void main(String[] args) {
		int a,b;
		Tv_rect tv =new Tv_rect();
		Landary_rect lan=new Landary_rect();
		Style_rect st=new Style_rect();
		Scanner pullm =new Scanner(System.in);
		
		while(true) {
			System.out.print(" ���ϴ� ������ ������ \n1. tv\n2. ��Ź��"
					+ "\n3. ��Ÿ�Ϸ� \n4. �ý������� \n>>>> ");
			a=pullm.nextInt();
			switch(a) {
			case 1: tv.tvObtion();	break;
			case 2: lan.LandaryObtion(); break;
			case 3: st.StyleMain(); break;
			case 4:System.out.println("�ý����� �����մϴ�. "); return;
			default :
				System.out.println("�߸� �������ϴ�. ���Է����ּ���");
			}
		}
		
	}
}
