package day11;

import java.util.Scanner;

public class Style_rect {
	Scanner pulls =new Scanner(System.in);
	Style_act stl =new Style_act();
	
	public void StyleMain() {
		int a;
		System.out.println("스타일러 옵션에 오셨습니다. ");
		while(true) {
			System.out.print("\n옵션을 선택해주세요 \n1. 탈취"
					+ "\n2.먼지제거 \n3.건조 \n4.종료하기\n>>>>");
			a=pulls.nextInt();
			switch(a) {
			case 1:	stl.smell(); break;
			case 2: stl.duty(); break;
			case 3: stl.dry(); break;
			case 4: System.out.println("스타일러가 종료합니다."); 
				return ;
			default : System.out.println("없는 설정입니다. 재입력해주세요 ");
				break;
			}
		}
	}
	
}
