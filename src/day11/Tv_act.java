package day11;

import java.util.Scanner;

public class Tv_act {
	private int sound, channel;
	Scanner pullt =new Scanner(System.in);
	public void channelCont() {
		int a;
		System.out.print("원하는 채널을 설정하세요 (1~99): ");
		a=pullt.nextInt();
		if(a>0&&a<100) {
			System.out.println(a+"번 채널입니다. ");
			this.channel=a;
		}else {
			System.out.println("검색하신 채널은 존재하지 않습니다.");
		}	
	}
	public void channelCheck() {
		System.out.println("현재 채널은 : "+this.channel+"번 입니다.");
	}
	public void soundCont() {
		int a;
		System.out.print("원하는 크기로 저장해주세요 (0~15): ");
		a=pullt.nextInt();
		if(a>=0&&a<=15) {
			System.out.println("볼륨이 "+a+"로 설정합니다. ");
			this.sound=a;
		}else {
			System.out.println("설정 할수 없는 볼륨입니다. ");
		}
	}
	public void soundCheck() {
		System.out.println("현재 볼륨은 : "+this.sound+"크기 입니다.");
	}
	
}
