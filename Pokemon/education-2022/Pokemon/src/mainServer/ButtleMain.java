package mainServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import mainServer.ButtlePokemon;

public class ButtleMain {


		/**
		 * �o�g���̊�{�I�ȗ���
		 * @throws IOException
		 */
		public static void doButtle(ButtlePokemon myPokemon, ButtlePokemon enemyPokemon) throws IOException{

		    boolean enemyDownFlg = false; //�G���|�ꂽ���ǂ����̔���
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		    
		    System.out.println();
		    System.out.println("�|�P�����o�g���X�^�[�g!");
		    System.out.print("- - - - - - - - - - - - - - - -" );
		    
		    do{
		    	ButtleCounters.outputActionList(myPokemon);

		            String str = null;
		            str = br.readLine();

		        System.out.println("���Ԃ�̍U���I");
		        ButtleCounters.useAction1(myPokemon.getActions().get(Integer.parseInt(str)), myPokemon, enemyPokemon);

		        if(enemyPokemon.getButtleHp() == 0){
		            enemyDownFlg = true;
		            break;
		        }

		        System.out.println("�����Ă̍U���I");
		        RandomEnemyChoice.randomChoice(enemyPokemon,myPokemon);

		    }while(myPokemon.getButtleHP() != 0);

		        ButtleCounters.outputResult(enemyDownFlg);
		        System.out.println("�o�g�����I��!!");
		}

}
