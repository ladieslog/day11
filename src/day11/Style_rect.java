package day11;

import java.util.Scanner;

public class Style_rect {
	Scanner pulls =new Scanner(System.in);
	Style_act stl =new Style_act();
	
	public void StyleMain() {
		int a;
		System.out.println("��Ÿ�Ϸ� �ɼǿ� ���̽��ϴ�. ");
		while(true) {
			System.out.print("\n�ɼ��� �������ּ��� \n1. Ż��"
					+ "\n2.�������� \n3.���� \n4.�����ϱ�\n>>>>");
			a=pulls.nextInt();
			switch(a) {
			case 1:	stl.smell(); break;
			case 2: stl.duty(); break;
			case 3: stl.dry(); break;
			case 4: System.out.println("��Ÿ�Ϸ��� �����մϴ�."); 
				return ;
			default : System.out.println("���� �����Դϴ�. ���Է����ּ��� ");
				break;
			}
		}
	}
	
}
