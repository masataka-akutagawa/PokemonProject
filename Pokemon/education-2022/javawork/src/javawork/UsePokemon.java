package javawork;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UsePokemon {

	private Scanner _sc;

	int num= 0;
	private Pokemon[] poke;

	public  UsePokemon(Pokemon[] poke) {
		this.poke = poke;
	}

	public Pokemon changePokemon(Pokemon using, Scanner scan, boolean isPlayer) {
		this._sc = scan;

		int num = 0;
		
		if(isPlayer) {
			while(true) {
				System.out.println("1:" + poke[0].getName() + "2:" + poke[1].getName() + "3:" + poke[2].getName());
				try{
					num = _sc.nextInt();
					num -= 1;
				}
				catch(InputMismatchException e){
					System.out.println("��������͂��Ă�������");
					continue;

				}
				if(num <= 2 && num >= 0) {
					
					if(poke[num].isDead()) {
						System.out.println("���̃|�P�����͐퓬�s�\�ł�");
						continue;
					}
					
					else if((poke[num] == using)) {
						System.out.println("���̃|�P�����͌��ݎg�p���Ă��܂�");
						continue;
					}
					else {			
						return poke[num];


					}

				}
				System.out.println("�������ԍ�����͂��Ă��������B");

			}

		}
		else {
			while(true) {



				num = (int)(Math.random()*3);

				if(poke[num].isDead()) {
					continue;

				}
				else if((poke[num] == using)) {
					continue;

				}
				else {
					return poke[num];
				}

			}

		}


	}


	public Pokemon[] getPoke() {
		return poke;
	}
	public Pokemon getPoke(int i) {
		return poke[i - 1];
	}



}
