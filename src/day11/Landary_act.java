package day11;

import java.util.Scanner;

public class Landary_act {
	Scanner pulla =new Scanner(System.in);
	private int count=0,button,water;
	public void land_sw() {
		if(this.button==2) {		
				System.out.println("빨래 탈수하겠습니다. ");
				this.count++; this.button=4;		
		}else if(this.button==0){
			System.out.println("빨래가 되지 않았습니다. 빨래후에 눌러주세요");
		}else {
			System.out.println("빨래가 작동중입니다. 일시정지나 정지후에 다시해주세요");
		}
	}
	
	public void land_wash() {
		if(this.count==0) {
			if(this.water>=20&&this.water<=60) {
				System.out.println("빨래 세탁하겠습니다. ");
				this.count++; this.button=2;
			}else if(this.water>60) {
				System.out.println("물에양이 너무 많아요 다시 설정해주세요");
			}else {
				System.out.println("물에 양이 부족합니다. 물량을 다시 설정해주세요");
			}	
		}else {
			System.out.println("다른설정이 있어 지금 못 사용합니다. 다시선택해주세요 ");
		}
	}
	
	public void waterAc() {
		System.out.print("물량을 설정해주세요 :");
		this.water=pulla.nextInt();
		System.out.println("물량을 설정했습니다. ");
	}
	
	public void land_st() {
		if (this.button==1) {
			System.out.println("다시 세탁합니다.");
			this.button=2;
			this.count++;
		}else if(this.button==2) {
			System.out.println("빨래중에 일시정지를 선택하셨습니다.");
			this.button=1;
		}else if(this.button==3) {
			System.out.println("다시 탈수합니다.");
			this.button=4;this.count++;
		}else if(this.button==4) {
			System.out.println("탈수중에 일시정지를 선택하셨습니다.");
			this.button=3;
		}else if (this.button==0) {
			System.out.println("세탁기가 정지되어있는 상태라 일시정지의 의미가 없습니다.");
		}
	}
	
	public void stop() {
		if(this.button>0) {
			System.out.println("지금 작동하는 것을 정지합니다. ");
			this.button=0;
		}else if(this.button==0) {
			System.out.println("이미 정지 상태입니다.");
		}else {
			System.out.println(".....");
		}
	}
	public void cond() {
		System.out.println(this.button);
		System.out.println("작동된 횟수: "+this.count);
	}
	public int num() {
		return this.button;
	}
}
