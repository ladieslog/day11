package day11;

import java.util.Scanner;

public class Tv_rect {
	
	Scanner pullt =new Scanner(System.in);
	
	public void tvObtion() {
		int a,c;
		String b;
		Tv_act tv =new Tv_act();
		System.out.println("tv옵션에 오셨습니다. ");
		while(true) {
			System.out.print("옵션을 선택해주세요\n1. 채널설정\n2. 채널확인 \n"
					+ "3. 소음설정\n4. 현재볼륨보기 \n5. 전원상태 \n>>>> ");
			a=pullt.nextInt();
			switch(a) {
			case 1:	tv.channelCont(); break;
			case 2: tv.channelCheck(); break;
			case 3:	tv.soundCont(); break;
			case 4: tv.soundCheck(); break;
			case 5: 
				System.out.print("전원을 끄실려면 yes번을 눌러주세요 ");
				b=pullt.next();
				if (b.equals("yes")) {
					System.out.println("전원이 꺼집니다");
					return;
				}else {
					System.out.println("전원이 계속 유지됩니다.");
					break;
				}
			default : System.out.println("잘못 눌렀습니다."); break;
			}
			
		}
	}
	
}
