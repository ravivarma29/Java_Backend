package com.switchloop;

public class DiceGame {
	public static void main(String[] args) {
		System.out.println(Math.random());
		int dice =(int) ((Math.random()*6));
		//System.out.println(dice);
		while(dice!= 6) {
			System.out.println(dice + " Times");
			dice =(int) ((Math.random()*6)+1);
			//	0.0 * 6 =0.0 + 1=1.0
			//0.1 * 6 =0.6 + 1=1.6=>1
			//0.2 * 6 =1.2 + 1=2.2=>2
			//0.5 * 6 =3.0 + 1=4.0=>4
			//0.9 * 6 =5.4 + 1=6.2=>6

		}
	}

}
