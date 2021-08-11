package day11;

import java.util.Scanner;

public class Style_act {
	Scanner pulls =new Scanner(System.in);
	private int  s,count;
	private String dull;
	public void smell() {
		if(this.s<2) {
			System.out.println("탈취모드입니다. 탈취하겠습니다. ");
			this.s++;
		}else {
			System.out.println("탈취를 2번이나 했습니다. 더이상은 안됩니다. ");
		}	
	}
	public void duty() {
		System.out.print("먼지제거 모드입니다. 먼지가 많습니까? (y/n): ");
		dull=pulls.next();
		if(dull.equals("y")) {
			System.out.println("먼지제거기능을 실행합니다.");
			this.count++;
		}else if(dull.equals("n")) {
			System.out.println("먼지가 별로 없습니다. ");
		}
		System.out.print("먼지를 턴 회수를 보겠습니까? (y/n): ");
		dull=pulls.next();
		if(dull.equals("y")) {
			System.out.println("먼지 턴 회수는 "+this.count+"번 입니다.");
		}else if(dull.equals("n")) {
			System.out.println("..");
		}
	}
	
	public void dry() {
		System.out.println("건조하겠습니다. ");
	}
}
