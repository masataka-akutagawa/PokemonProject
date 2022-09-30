package mainServer;

public class SimplePokemon {


	int pokemonID;
	String pokemonName;
	int HP;

	public SimplePokemon(int pokemonID,String pokemonName,int HP) {

		this.pokemonID = pokemonID;
		this.pokemonName = pokemonName;
		this.HP = HP;
	}
	public int getPokemonID() {
		return pokemonID;
	}
	public void setPokemonID(int pokemonID) {
		this.pokemonID = pokemonID;
	}
	public String getPokemonName() {
		return pokemonName;
	}
	public void setPokemonName(String pokemonName) {
		this.pokemonName = pokemonName;
	}
	public int HP() {
		return HP;
	}
	public void setHP(int HP) {
		this.HP = HP;
	}


}
