package javawork;

import java.util.*;

public class Battle {

	private Scanner _sc;
	private Pokemon players ;
	private Pokemon enemys ;
	private AbilitySelector _abilitySelector;
	private int myCount = 0;
	private int enemyCount = 0;

	UsePokemon myPokemons, enemyPokemons;

	private boolean _attack(Pokemon attacker, Pokemon deffender, Ability ability) {

		if (attacker.equals(players)) {
			System.out.println("あなたの" + attacker.getName() + "の" + ability.getName());
		}
		else if(attacker.equals(enemys)){
			System.out.println("あいての" + attacker.getName() + "の" + ability.getName());
		}

		//おうふくびんた処理
		if(ability.isMulti()) {

			_multiAttack(attacker, deffender, ability);

		}else {
			_singleAttack(attacker, deffender, ability);
		}

		if(deffender.isDead()) {
			if(deffender.equals(enemys)) {
				System.out.println("あいての" + deffender.getName() + "はたおれた");

				return false;
			}
			else if(deffender.equals(players)){
				System.out.println("あなたの" + deffender.getName() + "はたおれた");

				return false;
			}

		}

		System.out.println("のこりHP" + deffender.getHp());

		return true;

	}

	private void _singleAttack(Pokemon attacker,Pokemon deffender, Ability ability) {

		int damage = attacker.getAtk() * ability.getPower();
		if(attacker.getType().equals(ability.getType())) {
			damage *=1.5;
		}

		TypeCalculator2 relation = new TypeCalculator2(ability.getType(), deffender.getType());

		damage *= relation.getResult();
		//		ArrayList<String> effective = TypeCalculator.getEffectiveTypes(ability.getType());
		//		ArrayList<String> notEffective = TypeCalculator.getNotEffectiveTypes(ability.getType());
		//		for(String str : effective) {
		//			if(str == deffender.getType()) {
		//				damage *= 2.0;
		//				System.out.println("こうかはばつぐんだ");
		//			}	
		//		}
		//		for(String str : notEffective) {
		//			if(str == deffender.getType()) {
		//				damage /= 2.0;
		//				System.out.println("こうかはいまひとつのようだ");
		//			}
		//		}

		int critical = (int)(Math.random()*10);
		if(critical == 0) {
			damage *=2.0;
			System.out.println("急所に当たった。");
		}

		damage *= (100-(Math.random()*16))/100;
		//System.out.println(damage);
		//return damage;
		deffender.takeDamage(damage);

	}

	private int _multiAttack(Pokemon attacker,Pokemon deffender, Ability ability) {
		//int damage = 0;
		int count = (int)(Math.random()*4)+2;
		for(int i = 1; i <= count; i++) {

			_singleAttack(attacker, deffender, ability);

			//deffender.takeDamage(damage);

			if(deffender.isDead()) {
				System.out.println(i + "回あたった");
				break;
			}

		}
		if(deffender.getHp() > 0) {
			System.out.println(count + "回あたった");
		}

		return deffender.getHp();
	}

	private Pokemon  _selectPokemon(Pokemon poke, PokemonSelector select) {

		if(poke.equals(players)) {
			Pokemon myPoke = myPokemons.changePokemon(players, _sc, true);
			return myPoke;
		}
		else if(poke.equals(enemys)){
			Pokemon enemyPoke = enemyPokemons.changePokemon(enemys, _sc, false);
			return enemyPoke;
		}
		return null;
	}

	private boolean _judgeUserCanChange(Pokemon[] Pokemons) {
//		int count = 0;
//		count = (int) Arrays.stream(Pokemons).filter(pokemon -> pokemon.isDead()).count();
//		if(count < 2) {
//			return true;
//		}
//		else {
//			return false;
//		}
		return (int) Arrays.stream(Pokemons).filter(pokemon -> pokemon.isDead()).count() < 2;
	}

	private int  _act(Pokemon actor , Pokemon notActor, int selected, PokemonSelector pokeSelect) {

		if(selected >= 1&& selected <= 4) {

			Ability ability = actor.getAbility(selected);

			if(!_attack(actor , notActor, ability)) {
				if(actor == enemys) {
					myCount ++;
					if(myCount >= 3) {
						System.out.println("めのまえがまっくらになった");
						return 1;
					}	
				}
				else {
					enemyCount++;
					if(enemyCount >= 3) {
						System.out.println("しょうぶにかった");
						return 1;
					}	
				}

				return 2;
			}
			else {
				return 3;
			}
		}
		else {
			return 4;
		}



	}


	public  Battle(Pokemon[] myPoke, Pokemon[] enemyPoke, AbilitySelector abilitySelector, PokemonSelector pokeSelect, Scanner scan) {
		this.myPokemons = new UsePokemon(myPoke);
		this.enemyPokemons = new UsePokemon(enemyPoke);
		this._sc = scan;
		this.players = myPokemons.getPoke(1);
		this.enemys = enemyPokemons.getPoke(1);
		this._abilitySelector = abilitySelector;
		int result = 0;



		while(true) {		
			int ayataka =0;
			int selected = 0;

			while(true) {
				selected =  _abilitySelector.selectAbility(players.getAbilities(),true);
				if(selected != 5) {
					break;
				}
				else if(!_judgeUserCanChange(myPokemons.getPoke())) {
					System.out.println("これ以上交換できません");
					continue;
				}
				else {
					break;
				}

			}

			while(true) {
				ayataka =  _abilitySelector.selectAbility(enemys.getAbilities(),false);
				if(ayataka != 5) {
					break;
				}
				else if(!_judgeUserCanChange(enemyPokemons.getPoke())) {
					System.out.println("これ以上交換できません");
					continue;
				}
				else {
					break;
				}
			}


			int playerSpeed = players.getSpeed();
			int enemySpeed = enemys.getSpeed();


			if(selected == 5) {
				playerSpeed += 100;
			}
			if(ayataka == 5) {
				enemySpeed += 100;
			}

			if(playerSpeed >= enemySpeed) {

				//自分の攻撃

				result = _act(players, enemys, selected,pokeSelect);
				if(result == 1) {
					break;
				}
				else if(result == 2 || result == 4  ) {

					if(result == 2){
						enemys =  _selectPokemon(enemys, pokeSelect);
						this.enemys = enemys;
						System.out.println("あいては新たに" + enemys.getName()+ "を選びました");
						continue;
					}
					else {
						players =  _selectPokemon(players, pokeSelect);
						this.players = players;
						System.out.println("あなたは新たに" + players.getName()+ "を選びました");
					}
				}


				//相手の攻撃

				result = _act(enemys, players, ayataka, pokeSelect);
				if(result == 1) {
					break;
				}
				else if(result == 2 || result == 4  ) {
					if(result == 2){
						players =  _selectPokemon(players, pokeSelect);
						this.players = players;
						System.out.println("あなたは新たに" + players.getName()+ "を選びました");
						continue;
					}
					else {
						enemys =  _selectPokemon(enemys, pokeSelect);
						this.enemys = enemys;
						System.out.println("あいては新たに" + enemys.getName()+ "を選びました");	


					}
				}



			}
			else {
				//相手の攻撃

				result = _act(enemys, players, ayataka, pokeSelect);
				if(result == 1) {
					break;
				}
				else if(result == 2 || result == 4  ) {
					if(result == 2){
						players =  _selectPokemon(players, pokeSelect);
						this.players = players;
						System.out.println("あなたは新たに" + players.getName()+ "を選びました");

						continue;
					}
					else {
						enemys =  _selectPokemon(enemys, pokeSelect);
						this.enemys = enemys;
						System.out.println("あいては新たに" + enemys.getName()+ "を選びました");	
					}
				}


				//じぶんの攻撃
				result = _act(players, enemys, selected,  pokeSelect);
				if(result == 1) {
					break;
				}
				else if(result == 2 || result == 4  ) {

					if(result == 2){
						enemys =  _selectPokemon(enemys, pokeSelect);
						this.enemys = enemys;
						System.out.println("あいては新たに" + enemys.getName()+ "を選びました");
						continue;
					}
					else {
						players =  _selectPokemon(players, pokeSelect);
						this.players = players;
						System.out.println("あなたは新たに" + players.getName()+ "を選びました");
					}
				}

			}





		}
	}

}


