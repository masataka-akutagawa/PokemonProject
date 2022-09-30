package javawork;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		
		PokemonSelector pokemon = new PokemonSelector(scan);
		AbilitySelector ability = new AbilitySelector(scan);
		
		
		Pokemon[] myPoke = pokemon.selectPokemon(true);
		Pokemon[] enemyPoke = pokemon.selectPokemon(false);
		
		System.out.println("あなたの選んだポケモンは" + myPoke[0].getName() + ", "+myPoke[1].getName() +", " + myPoke[2].getName() + "です");
		System.out.println("あいての選んだポケモンは" + enemyPoke[0].getName() + "です");
		
		System.out.println("ポケモンバトルをはじめます");
		Battle battle = new Battle(myPoke,enemyPoke,ability, pokemon, scan);

		}
		
		
	}


