package javawork;


import java.util.InputMismatchException;
import java.util.*;
import java.util.Scanner;

public class PokemonSelector {

	private Scanner _sc ;
	private Pokemon myPoke;
	private Pokemon enemyPoke;
	
	public PokemonSelector(Scanner scan){
		this._sc = scan;
	}

	
	public Pokemon[] selectPokemon(boolean isPlayer) {
		int num = 0;
		ArrayList<Integer> count = new ArrayList<>();
		Pokemon[] poke = new Pokemon[3];
		
//		Arrays.stream(poke).forEach( i ->{
		for(int i = 0; i < poke.length; i++) {
			
			
			

			if(isPlayer) {
				while(true) {
					System.out.println("�|�P����������" + (3 - i) + "�̑I��ł�������");
					System.out.println("1:�|�b�`���}�@2:�i�G�g���@3:�q�R�U��");
					System.out.println("4: �C�[�u�C 5 �s�J�`���E  6:�~�j�����E -> " );
					
					try {
						num = _sc.nextInt();
						
					}
					catch(InputMismatchException e){
						System.out.println("��������͂��Ă�������");
						continue;
					}
					
					if(num <= 6 && num >= 1) {
							if(!count.contains(num)) {
								count.add(num);
								break;
						}
						
						
					}
					System.out.println("�������ԍ�����͂��Ă��������B");
				}
			}
			else {
					while(true) {
						num = (int)(Math.random()*6)+1;
						if(!count.contains(num)) {
							count.add(num);
							break;
					}
					
				}
					
				}

			Ability[] ability1 = {
					new Ability("����������",5,"�m�[�}��",false),
					new Ability("�����ӂ��т�",3,"�m�[�}��",true),
					new Ability("����",5,"�݂�",false),
					new Ability("�݂��ł��ۂ�",7,"�݂�",false)
					
			};
			Ability[] ability2 = {
					new Ability("����������",5,"�m�[�}��",false),
					new Ability("�^�l�}�V���K��",3,"����",true),
					new Ability("���̂�",5,"����",false),
					new Ability("�͂��σJ�b�^�[",7,"����",false)
				};
			Ability[] ability3 = {
					new Ability("����������",5,"�m�[�}��",false),
					new Ability("�����ӂ��т�",3,"�m�[�}��",true),
					new Ability("�Ђ̂�",5,"�ق̂�",false),
					new Ability("�����񂮂��",7,"�ق̂�",false)
				};
			Ability[] ability4 = {
					new Ability("����������",5,"�m�[�}��",false),
					new Ability("�ɂǂ���",3,"�����Ƃ�",true),
					new Ability("�ǂ납��",5,"���߂�",false),
					new Ability("�n�C�p�[�{�C�X",8,"�m�[�}��",false)
				};
			Ability[] ability5 = {
					new Ability("����������",5,"�m�[�}��",false),
					new Ability("�����ӂ��т�",3,"�m�[�}��",true),
					new Ability("�ł񂫃V���b�N",5,"�ł�",false),
					new Ability("10�܂�{���g",8,"�ł�",false)
				};
			Ability[] ability6 = {
					new Ability("10�܂�{���g",8,"�ł�",false),
					new Ability("�ꂢ�Ƃ��r�[��",8,"������",false),
					new Ability("�����̂ڂ�",8,"�݂�",false),
					new Ability("��イ�̂͂ǂ�",9,"�h���S��",false)
				};
			
			
			if (num == 1) {
				 pokemon = new Pokemon(200, 11, 11, 10, "�݂�", "�|�b�`���}",ability1);
				

			}
			else if (num == 2) {

				pokemon = new Pokemon(230, 8, 15, 8, "����", "�i�G�g��", ability2);

			}
			else if(num == 3){
				pokemon = new Pokemon(170, 12, 5, 15, "�ق̂�", "�q�R�U��", ability3);

			}else if(num == 4) {
				pokemon = new Pokemon(190, 9, 9, 12, "�m�[�}��", "�C�[�u�C", ability4);
			}
			else if (num == 5) {
				pokemon = new Pokemon(170, 11, 7, 17, "�ł�", "�s�J�`���E", ability5);
			}
			else if (num == 6) {
				pokemon = new Pokemon(150, 8, 10, 8, "�h���S��", "�~�j�����E", ability6);
			}
			
			poke[i] = pokemon;
		}
		
			return poke;
	}
	
}
