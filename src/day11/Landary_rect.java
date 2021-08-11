package day11;

import java.util.Scanner;

public class Landary_rect {
	Scanner pulla =new Scanner(System.in);
	Landary_act lan=new Landary_act();
	public void LandaryObtion() {
		
		System.out.println("세탁기에 오셨습니다. ");
		while(true) {
			int a,n;
			System.out.print("옵션을 골라주세요 \n"
					+ "1.탈수 \n2.세탁 \n3.물량 조절\n4.작동/일시정지 "
					+ "\n5.정지 \n6.전원 끄기\n>>>> ");
			a=pulla.nextInt();
			switch(a) {
			case 1:	lan.land_sw();	break;
			case 2: lan.land_wash(); break;
			case 3: lan.waterAc(); break;
			case 4: lan.land_st(); break;
			case 5: lan.stop(); break;
			case 6:	n=lan.num();
				if(n==0) {
					System.out.println("전원을 끄겠습니다.");
					return ;
				}else {
					System.out.println("아직 세탁기가 작동중입니다. 정지후 눌러주세요");
					break;
				}
			case 7: lan.cond();
			default :
				System.out.println("없는 옵션입니다. 다시 눌러주세요");
			}
			
		}
	}
}
