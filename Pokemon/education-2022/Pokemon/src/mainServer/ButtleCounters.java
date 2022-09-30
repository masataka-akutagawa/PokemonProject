package mainServer;

public class ButtleCounters {

	/**
     * 基本的な技の流れ
     * @param offenceAction:攻撃側の技
     * @param offenceDragon:攻撃側のポケモン
     * @param defenceDragon:防御側のポケモン
     */
    public static void useAction1(Action offenceAction,ButtlePokemon offenceSide, ButtlePokemon defenceSide){

   

         //攻撃技の表示
         String actionName = offenceAction.getActionName().replaceAll("\t", "");//技名に含まれているタブ区切りを解除する
         System.out.println(offenceSide.getPokemonName()+"の"+actionName+"!!");

         //攻撃技
         Attack(offenceAction,offenceSide,defenceSide);

        
    }

    /**
     * 攻撃技の流れ
     * @param offenceAction
     * @param offenceSide
     * @param defenceSide
     */
    public static void Attack(Action offenceAction,ButtlePokemon offenceSide, ButtlePokemon defenceSide){


        int damage = offenceAction.getAttack(); //技の威力

        int defencePokemonNokoriHp = 0; //バトルで更新する防御側ポケモンのHP量


        //相手の残りHPの計算
        defencePokemonNokoriHp = defenceSide.getButtleHp() - damage;
        if(defencePokemonNokoriHp <= 0){
            defenceSide.setButtleHP(0);
        }else{
            defenceSide.setButtleHP(defencePokemonNokoriHp);
        }


        System.out.println(defenceSide.getPokemonName()+"は"+damage+"のダメージで残り体力が"+defenceSide.getButtleHp()+"になった!");

    }

    /**
     * 技リストを表示する
     * @param myPokemon
     */
    public static void outputActionList(ButtlePokemon myPokemon){
            System.out.println("\nコマンド\t\t技名");
            System.out.println("\t1:\t\t"+myPokemon.getActions().get(1).getActionName());
            System.out.println("\t2:\t\t"+myPokemon.getActions().get(2).getActionName());
            System.out.println("\t3:\t\t"+myPokemon.getActions().get(3).getActionName());
            System.out.println("\t4:\t\t"+myPokemon.getActions().get(4).getActionName());
            System.out.print("技を選んでください>");
    }



    /**
     * 勝敗結果を表示する
     * @param enemyDownFlg
     */
    public static void outputResult(boolean enemyDownFlg){
        if(enemyDownFlg){
        System.out.println("\n勝ちました！");
        }else{
        System.out.println("\n負けました‥");
        }
    }

	public static void useAction(Action offenceAction, ButtlePokemon myPokemon, ButtlePokemon enemyPokemon) {
		// TODO Auto-generated method stub
		
	}

	
		
}
