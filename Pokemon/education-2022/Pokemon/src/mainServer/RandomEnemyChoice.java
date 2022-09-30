package mainServer;

import mainServer.ButtlePokemon;

public class RandomEnemyChoice {

		    /**
		     * ランダムに技を生成し、実行する
		     * @param enemyPokemon
		     * @param myPokemon
		     */
		    public static void randomChoice(ButtlePokemon enemyPokemon, ButtlePokemon myPokemon){

		    //ランダムに繰り出す技を選択する
		    int randomChoice = 0;
		    randomChoice = (int)(Math.random()*4 + 1);

		    //技を繰り出す
		    ButtleCounters.useAction(enemyPokemon.getActions().get(randomChoice),enemyPokemon, myPokemon);

		    }

}
