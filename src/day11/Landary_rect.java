package day11;

import java.util.Scanner;

public class Landary_rect {
	Scanner pulla =new Scanner(System.in);
	Landary_act lan=new Landary_act();
	public void LandaryObtion() {
		
		System.out.println("��Ź�⿡ ���̽��ϴ�. ");
		while(true) {
			int a,n;
			System.out.print("�ɼ��� ����ּ��� \n"
					+ "1.Ż�� \n2.��Ź \n3.���� ����\n4.�۵�/�Ͻ����� "
					+ "\n5.���� \n6.���� ����\n>>>> ");
			a=pulla.nextInt();
			switch(a) {
			case 1:	lan.land_sw();	break;
			case 2: lan.land_wash(); break;
			case 3: lan.waterAc(); break;
			case 4: lan.land_st(); break;
			case 5: lan.stop(); break;
			case 6:	n=lan.num();
				if(n==0) {
					System.out.println("������ ���ڽ��ϴ�.");
					return ;
				}else {
					System.out.println("���� ��Ź�Ⱑ �۵����Դϴ�. ������ �����ּ���");
					break;
				}
			case 7: lan.cond();
			default :
				System.out.println("���� �ɼ��Դϴ�. �ٽ� �����ּ���");
			}
			
		}
	}
}
