package day11;

import java.util.Scanner;

public class Tv_rect {
	
	Scanner pullt =new Scanner(System.in);
	
	public void tvObtion() {
		int a,c;
		String b;
		Tv_act tv =new Tv_act();
		System.out.println("tv�ɼǿ� ���̽��ϴ�. ");
		while(true) {
			System.out.print("�ɼ��� �������ּ���\n1. ä�μ���\n2. ä��Ȯ�� \n"
					+ "3. ��������\n4. ���纼������ \n5. �������� \n>>>> ");
			a=pullt.nextInt();
			switch(a) {
			case 1:	tv.channelCont(); break;
			case 2: tv.channelCheck(); break;
			case 3:	tv.soundCont(); break;
			case 4: tv.soundCheck(); break;
			case 5: 
				System.out.print("������ ���Ƿ��� yes���� �����ּ��� ");
				b=pullt.next();
				if (b.equals("yes")) {
					System.out.println("������ �����ϴ�");
					return;
				}else {
					System.out.println("������ ��� �����˴ϴ�.");
					break;
				}
			default : System.out.println("�߸� �������ϴ�."); break;
			}
			
		}
	}
	
}
