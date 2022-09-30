package mainServer;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import mainServer.ButtlePokemon;


public class PokemonMain {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try{

			//ポケモン一覧を取得する
			ChoicePokemon.searchPokemon();

			//どのポケモンを作成するかを選択する
			String choiceMyPokemon = null;
			String choiceEnemyPokemon = null;
			System.out.print("自分が使用するポケモンをidで選んでください>");
			choiceMyPokemon = br.readLine();
			System.out.print("相手に使用させるポケモンをidで選んでください>");
			choiceEnemyPokemon = br.readLine();


			//ポケモン生成
			ButtlePokemon myPokemon = ChoicePokemon.makePokemon(Integer.parseInt(choiceMyPokemon));
			ButtlePokemon enemyPokemon = ChoicePokemon.makePokemon(Integer.parseInt(choiceEnemyPokemon));

			//バトル
			ButtleMain.doButtle(myPokemon,enemyPokemon);

		}catch(Exception e){
			System.out.println("深刻なエラーが出ました");
		}
	}

}
