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
					System.out.println("ポケモンをあと" + (3 - i) + "体選んでください");
					System.out.println("1:ポッチャマ　2:ナエトル　3:ヒコザル");
					System.out.println("4: イーブイ 5 ピカチュウ  6:ミニリュウ -> " );
					
					try {
						num = _sc.nextInt();
						
					}
					catch(InputMismatchException e){
						System.out.println("整数を入力してください");
						continue;
					}
					
					if(num <= 6 && num >= 1) {
							if(!count.contains(num)) {
								count.add(num);
								break;
						}
						
						
					}
					System.out.println("正しい番号を入力してください。");
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
					new Ability("たいあたり",5,"ノーマル",false),
					new Ability("おうふくびんた",3,"ノーマル",true),
					new Ability("あわ",5,"みず",false),
					new Ability("みずでっぽう",7,"みず",false)
					
			};
			Ability[] ability2 = {
					new Ability("たいあたり",5,"ノーマル",false),
					new Ability("タネマシンガン",3,"くさ",true),
					new Ability("このは",5,"くさ",false),
					new Ability("はっぱカッター",7,"くさ",false)
				};
			Ability[] ability3 = {
					new Ability("たいあたり",5,"ノーマル",false),
					new Ability("おうふくびんた",3,"ノーマル",true),
					new Ability("ひのこ",5,"ほのお",false),
					new Ability("かえんぐるま",7,"ほのお",false)
				};
			Ability[] ability4 = {
					new Ability("たいあたり",5,"ノーマル",false),
					new Ability("にどげり",3,"かくとう",true),
					new Ability("どろかけ",5,"じめん",false),
					new Ability("ハイパーボイス",8,"ノーマル",false)
				};
			Ability[] ability5 = {
					new Ability("たいあたり",5,"ノーマル",false),
					new Ability("おうふくびんた",3,"ノーマル",true),
					new Ability("でんきショック",5,"でんき",false),
					new Ability("10まんボルト",8,"でんき",false)
				};
			Ability[] ability6 = {
					new Ability("10まんボルト",8,"でんき",false),
					new Ability("れいとうビーム",8,"こおり",false),
					new Ability("たきのぼり",8,"みず",false),
					new Ability("りゅうのはどう",9,"ドラゴン",false)
				};
			
			
			if (num == 1) {
				 pokemon = new Pokemon(200, 11, 11, 10, "みず", "ポッチャマ",ability1);
				

			}
			else if (num == 2) {

				pokemon = new Pokemon(230, 8, 15, 8, "くさ", "ナエトル", ability2);

			}
			else if(num == 3){
				pokemon = new Pokemon(170, 12, 5, 15, "ほのお", "ヒコザル", ability3);

			}else if(num == 4) {
				pokemon = new Pokemon(190, 9, 9, 12, "ノーマル", "イーブイ", ability4);
			}
			else if (num == 5) {
				pokemon = new Pokemon(170, 11, 7, 17, "でんき", "ピカチュウ", ability5);
			}
			else if (num == 6) {
				pokemon = new Pokemon(150, 8, 10, 8, "ドラゴン", "ミニリュウ", ability6);
			}
			
			poke[i] = pokemon;
		}
		
			return poke;
	}
	
}
