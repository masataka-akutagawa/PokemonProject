package mainServer;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



	public class ChoicePokemon {

		
		public static void searchPokemon(){

	        //�����őI���ł���|�P�������쐬����
	            SimplePokemon pochama = new SimplePokemon(1,"�|�b�`���}",200);
	            SimplePokemon naetoru = new SimplePokemon(2,"�i�G�g��",230);
	            SimplePokemon hikozaru = new SimplePokemon(3,"�q�R�U��",170);

	        //�쐬�����|�P���������X�g�ɂ߂�
	        List<SimplePokemon> choicePokemonList = new ArrayList<>();
	            choicePokemonList.add(pochama);
	            choicePokemonList.add(naetoru);
	            choicePokemonList.add(hikozaru);

	        //���X�g��\������
	        System.out.println("ID:\t�|�P������");
	        for(SimplePokemon list : choicePokemonList){
	            System.out.println(list.getPokemonID()+":\t"+list.getPokemonName());
	        }
	    }

	    /**
	     * �I�����ꂽ�l�����ɂ��āA���X�g����|�P�����𐶂ݏo��
	     * ���̌�A�Z����������
	     */
	    public static ButtlePokemon makePokemon(int PokemonID){

	    //�|�P�����𐶂ݏo��
	    ButtlePokemon buttlePokemon = makeButtlePokemon(PokemonID);

	    //�Z���X�g���擾����
	    Map<Integer, Action> buttleActionMap = makeButtleAction() ;

	    //�Z���|�P�����Ɏ�������
	    Map<Integer, Action> buttlePokemonActionMap = new HashMap<>();

	        //�|�P���������Z��id���擾����
	        int actionID_1 = buttlePokemon.getAction1();
	        int actionID_2 = buttlePokemon.getAction2();
	        int actionID_3 = buttlePokemon.getAction3();
	        int actionID_4 = buttlePokemon.getAction4();

	        //�|�P���������Z���Z���X�g����擾����
	        Action action1 = buttleActionMap.get(actionID_1);
	        Action action2 = buttleActionMap.get(actionID_2);
	        Action action3 = buttleActionMap.get(actionID_3);
	        Action action4 = buttleActionMap.get(actionID_4);

	        //�|�P�����ƋZ�����т���
	        buttlePokemonActionMap.put(1, action1);
	        buttlePokemonActionMap.put(2, action2);
	        buttlePokemonActionMap.put(3, action3);
	        buttlePokemonActionMap.put(4, action4);
	        
	        buttlePokemon.setActions(buttlePokemonActionMap);

	    return buttlePokemon;
	    }


	    /**
	     * �|�P�����𐶐����A�Z���X�g��id�����ꂼ��ɕt�^����B
	     * ��������DB���g�p����Ɨǂ��Ǝv���܂��B
	     * @param pokemonID
	     * @return
	     */
	    private static ButtlePokemon makeButtlePokemon(int pokemonID) {
	        ButtlePokemon makePokemon = null;

	//�����ɂ���ĈقȂ�|�P�����𐶂ݏo��

	        switch(pokemonID) {
	        case 1:

	//�o�g���h�|�P�����̃R���X�g���N�^�ւ̈�����ID�E�|�P�����̖��O
	            ButtlePokemon pochama = new ButtlePokemon(200,1,"�|�b�`���}",10,10,10,1);

	//�o�g���|�P�����ɋZ���Z�b�g����
	            pochama.setAction1(1);
	            pochama.setAction2(2);
	            pochama.setAction3(3);
	            pochama.setAction4(4);
	            makePokemon = pochama;
	            break;
	        case 2:
	            ButtlePokemon naetoru = new ButtlePokemon(230,2,"�i�G�g��",8,15,5,2);
	            naetoru.setAction1(1);
	            naetoru.setAction2(2);
	            naetoru.setAction3(5);
	            naetoru.setAction4(6);
	            makePokemon = naetoru;
	            break;
	        case 3:
	            ButtlePokemon hikozaru = new ButtlePokemon(170,3,"�q�R�U��",12,5,15,3);
	            hikozaru.setAction1(1);
	            hikozaru.setAction2(2);
	            hikozaru.setAction3(7);
	            hikozaru.setAction4(8);
	            makePokemon =  hikozaru;
	            break;
	        }

	        return makePokemon;
	    }

	    /**
	     * �Z���X�g���擾����B
	     * ��������DB���g�p����Ɨǂ��Ǝv���܂��B
	     * @return
	     */
	    private static Map<Integer, Action> makeButtleAction() {

	        //�Z���X�g�ꗗ��錾����
	        Action action1 = new Action(1,"����������", 2,0,false);
	        Action action2 = new Action(2,"�����ӂ��т�", 4,0,true);
	        Action action3 = new Action(3,"����", 3,1,false);
	        Action action4 = new Action(4,"�݂��ł��ۂ�", 5,1,false);
	        Action action5 = new Action(5,"���̂�", 6,2,false);
	        Action action6 = new Action(6,"�͂��σJ�b�^�[", 6,2,false);
	        Action action7 = new Action(7,"�Ђ̂�", 6,3,false);
	        Action action8 = new Action(8,"�����񂮂��", 6,3,false);

	        //�Z���X�g���}�b�v�ɂ߂�
	        Map<Integer, Action> actionList = new HashMap<>();
	        actionList.put(1, action1);
	        actionList.put(2, action2);
	        actionList.put(3, action3);
	        actionList.put(4, action4);
	        actionList.put(5, action5);
	        actionList.put(6, action6);
	        actionList.put(7, action7);
	        actionList.put(8, action8);
	        

	        return actionList;
	    }
	

}
