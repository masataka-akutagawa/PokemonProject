package mainServer;

public class ButtleCounters {

	/**
     * ��{�I�ȋZ�̗���
     * @param offenceAction:�U�����̋Z
     * @param offenceDragon:�U�����̃|�P����
     * @param defenceDragon:�h�䑤�̃|�P����
     */
    public static void useAction1(Action offenceAction,ButtlePokemon offenceSide, ButtlePokemon defenceSide){

   

         //�U���Z�̕\��
         String actionName = offenceAction.getActionName().replaceAll("\t", "");//�Z���Ɋ܂܂�Ă���^�u��؂����������
         System.out.println(offenceSide.getPokemonName()+"��"+actionName+"!!");

         //�U���Z
         Attack(offenceAction,offenceSide,defenceSide);

        
    }

    /**
     * �U���Z�̗���
     * @param offenceAction
     * @param offenceSide
     * @param defenceSide
     */
    public static void Attack(Action offenceAction,ButtlePokemon offenceSide, ButtlePokemon defenceSide){


        int damage = offenceAction.getAttack(); //�Z�̈З�

        int defencePokemonNokoriHp = 0; //�o�g���ōX�V����h�䑤�|�P������HP��


        //����̎c��HP�̌v�Z
        defencePokemonNokoriHp = defenceSide.getButtleHp() - damage;
        if(defencePokemonNokoriHp <= 0){
            defenceSide.setButtleHP(0);
        }else{
            defenceSide.setButtleHP(defencePokemonNokoriHp);
        }


        System.out.println(defenceSide.getPokemonName()+"��"+damage+"�̃_���[�W�Ŏc��̗͂�"+defenceSide.getButtleHp()+"�ɂȂ���!");

    }

    /**
     * �Z���X�g��\������
     * @param myPokemon
     */
    public static void outputActionList(ButtlePokemon myPokemon){
            System.out.println("\n�R�}���h\t\t�Z��");
            System.out.println("\t1:\t\t"+myPokemon.getActions().get(1).getActionName());
            System.out.println("\t2:\t\t"+myPokemon.getActions().get(2).getActionName());
            System.out.println("\t3:\t\t"+myPokemon.getActions().get(3).getActionName());
            System.out.println("\t4:\t\t"+myPokemon.getActions().get(4).getActionName());
            System.out.print("�Z��I��ł�������>");
    }



    /**
     * ���s���ʂ�\������
     * @param enemyDownFlg
     */
    public static void outputResult(boolean enemyDownFlg){
        if(enemyDownFlg){
        System.out.println("\n�����܂����I");
        }else{
        System.out.println("\n�����܂����d");
        }
    }

	public static void useAction(Action offenceAction, ButtlePokemon myPokemon, ButtlePokemon enemyPokemon) {
		// TODO Auto-generated method stub
		
	}

	
		
}
