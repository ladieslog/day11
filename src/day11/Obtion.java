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
			System.out.print(" 원하는 가구에 가세요 \n1. tv\n2. 세탁기"
					+ "\n3. 스타일러 \n4. 시스템종료 \n>>>> ");
			a=pullm.nextInt();
			switch(a) {
			case 1: tv.tvObtion();	break;
			case 2: lan.LandaryObtion(); break;
			case 3: st.StyleMain(); break;
			case 4:System.out.println("시스템을 종료합니다. "); return;
			default :
				System.out.println("잘못 눌렀습니다. 재입력해주세요");
			}
		}
		
	}
}
