package mainServer;

import mainServer.ButtlePokemon;

public class RandomEnemyChoice {

		    /**
		     * �����_���ɋZ�𐶐����A���s����
		     * @param enemyPokemon
		     * @param myPokemon
		     */
		    public static void randomChoice(ButtlePokemon enemyPokemon, ButtlePokemon myPokemon){

		    //�����_���ɌJ��o���Z��I������
		    int randomChoice = 0;
		    randomChoice = (int)(Math.random()*4 + 1);

		    //�Z���J��o��
		    ButtleCounters.useAction(enemyPokemon.getActions().get(randomChoice),enemyPokemon, myPokemon);

		    }

}
