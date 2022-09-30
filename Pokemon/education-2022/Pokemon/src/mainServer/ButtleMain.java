package mainServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import mainServer.ButtlePokemon;

public class ButtleMain {


		/**
		 * バトルの基本的な流れ
		 * @throws IOException
		 */
		public static void doButtle(ButtlePokemon myPokemon, ButtlePokemon enemyPokemon) throws IOException{

		    boolean enemyDownFlg = false; //敵が倒れたかどうかの判定
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    
		    System.out.println();
		    System.out.println("ポケモンバトルスタート!");
		    System.out.print("- - - - - - - - - - - - - - - -" );
		    
		    do{
		    	ButtleCounters.outputActionList(myPokemon);

		            String str = null;
		            str = br.readLine();

		        System.out.println("じぶんの攻撃！");
		        ButtleCounters.useAction1(myPokemon.getActions().get(Integer.parseInt(str)), myPokemon, enemyPokemon);

		        if(enemyPokemon.getButtleHp() == 0){
		            enemyDownFlg = true;
		            break;
		        }

		        System.out.println("あいての攻撃！");
		        RandomEnemyChoice.randomChoice(enemyPokemon,myPokemon);

		    }while(myPokemon.getButtleHP() != 0);

		        ButtleCounters.outputResult(enemyDownFlg);
		        System.out.println("バトルが終了!!");
		}

}
