package mainServer;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import mainServer.ButtlePokemon;


public class PokemonMain {

	public static void main(String[] args)throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		try{

			//�|�P�����ꗗ���擾����
			ChoicePokemon.searchPokemon();

			//�ǂ̃|�P�������쐬���邩��I������
			String choiceMyPokemon = null;
			String choiceEnemyPokemon = null;
			System.out.print("�������g�p����|�P������id�őI��ł�������>");
			choiceMyPokemon = br.readLine();
			System.out.print("����Ɏg�p������|�P������id�őI��ł�������>");
			choiceEnemyPokemon = br.readLine();


			//�|�P��������
			ButtlePokemon myPokemon = ChoicePokemon.makePokemon(Integer.parseInt(choiceMyPokemon));
			ButtlePokemon enemyPokemon = ChoicePokemon.makePokemon(Integer.parseInt(choiceEnemyPokemon));

			//�o�g��
			ButtleMain.doButtle(myPokemon,enemyPokemon);

		}catch(Exception e){
			System.out.println("�[���ȃG���[���o�܂���");
		}
	}

}
