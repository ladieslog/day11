package day11;

import java.util.Scanner;

public class Tv_act {
	private int sound, channel;
	Scanner pullt =new Scanner(System.in);
	public void channelCont() {
		int a;
		System.out.print("���ϴ� ä���� �����ϼ��� (1~99): ");
		a=pullt.nextInt();
		if(a>0&&a<100) {
			System.out.println(a+"�� ä���Դϴ�. ");
			this.channel=a;
		}else {
			System.out.println("�˻��Ͻ� ä���� �������� �ʽ��ϴ�.");
		}	
	}
	public void channelCheck() {
		System.out.println("���� ä���� : "+this.channel+"�� �Դϴ�.");
	}
	public void soundCont() {
		int a;
		System.out.print("���ϴ� ũ��� �������ּ��� (0~15): ");
		a=pullt.nextInt();
		if(a>=0&&a<=15) {
			System.out.println("������ "+a+"�� �����մϴ�. ");
			this.sound=a;
		}else {
			System.out.println("���� �Ҽ� ���� �����Դϴ�. ");
		}
	}
	public void soundCheck() {
		System.out.println("���� ������ : "+this.sound+"ũ�� �Դϴ�.");
	}
	
}
