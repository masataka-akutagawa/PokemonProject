package mainServer;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



	public class ChoicePokemon {

		
		public static void searchPokemon(){

	        //ここで選択できるポケモンを作成する
	            SimplePokemon pochama = new SimplePokemon(1,"ポッチャマ",200);
	            SimplePokemon naetoru = new SimplePokemon(2,"ナエトル",230);
	            SimplePokemon hikozaru = new SimplePokemon(3,"ヒコザル",170);

	        //作成したポケモンをリストにつめる
	        List<SimplePokemon> choicePokemonList = new ArrayList<>();
	            choicePokemonList.add(pochama);
	            choicePokemonList.add(naetoru);
	            choicePokemonList.add(hikozaru);

	        //リストを表示する
	        System.out.println("ID:\tポケモン名");
	        for(SimplePokemon list : choicePokemonList){
	            System.out.println(list.getPokemonID()+":\t"+list.getPokemonName());
	        }
	    }

	    /**
	     * 選択された値を元にして、リストからポケモンを生み出す
	     * その後、技を持たせる
	     */
	    public static ButtlePokemon makePokemon(int PokemonID){

	    //ポケモンを生み出す
	    ButtlePokemon buttlePokemon = makeButtlePokemon(PokemonID);

	    //技リストを取得する
	    Map<Integer, Action> buttleActionMap = makeButtleAction() ;

	    //技をポケモンに持たせる
	    Map<Integer, Action> buttlePokemonActionMap = new HashMap<>();

	        //ポケモンが持つ技のidを取得する
	        int actionID_1 = buttlePokemon.getAction1();
	        int actionID_2 = buttlePokemon.getAction2();
	        int actionID_3 = buttlePokemon.getAction3();
	        int actionID_4 = buttlePokemon.getAction4();

	        //ポケモンが持つ技を技リストから取得する
	        Action action1 = buttleActionMap.get(actionID_1);
	        Action action2 = buttleActionMap.get(actionID_2);
	        Action action3 = buttleActionMap.get(actionID_3);
	        Action action4 = buttleActionMap.get(actionID_4);

	        //ポケモンと技を結びつける
	        buttlePokemonActionMap.put(1, action1);
	        buttlePokemonActionMap.put(2, action2);
	        buttlePokemonActionMap.put(3, action3);
	        buttlePokemonActionMap.put(4, action4);
	        
	        buttlePokemon.setActions(buttlePokemonActionMap);

	    return buttlePokemon;
	    }


	    /**
	     * ポケモンを生成し、技リストのidをそれぞれに付与する。
	     * ※ここでDBを使用すると良いと思います。
	     * @param pokemonID
	     * @return
	     */
	    private static ButtlePokemon makeButtlePokemon(int pokemonID) {
	        ButtlePokemon makePokemon = null;

	//引数によって異なるポケモンを生み出す

	        switch(pokemonID) {
	        case 1:

	//バトルドポケモンのコンストラクタへの引数はID・ポケモンの名前
	            ButtlePokemon pochama = new ButtlePokemon(200,1,"ポッチャマ",10,10,10,1);

	//バトルポケモンに技をセットする
	            pochama.setAction1(1);
	            pochama.setAction2(2);
	            pochama.setAction3(3);
	            pochama.setAction4(4);
	            makePokemon = pochama;
	            break;
	        case 2:
	            ButtlePokemon naetoru = new ButtlePokemon(230,2,"ナエトル",8,15,5,2);
	            naetoru.setAction1(1);
	            naetoru.setAction2(2);
	            naetoru.setAction3(5);
	            naetoru.setAction4(6);
	            makePokemon = naetoru;
	            break;
	        case 3:
	            ButtlePokemon hikozaru = new ButtlePokemon(170,3,"ヒコザル",12,5,15,3);
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
	     * 技リストを取得する。
	     * ※ここでDBを使用すると良いと思います。
	     * @return
	     */
	    private static Map<Integer, Action> makeButtleAction() {

	        //技リスト一覧を宣言する
	        Action action1 = new Action(1,"たいあたり", 2,0,false);
	        Action action2 = new Action(2,"おうふくびんた", 4,0,true);
	        Action action3 = new Action(3,"あわ", 3,1,false);
	        Action action4 = new Action(4,"みずでっぽう", 5,1,false);
	        Action action5 = new Action(5,"このは", 6,2,false);
	        Action action6 = new Action(6,"はっぱカッター", 6,2,false);
	        Action action7 = new Action(7,"ひのこ", 6,3,false);
	        Action action8 = new Action(8,"かえんぐるま", 6,3,false);

	        //技リストをマップにつめる
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
