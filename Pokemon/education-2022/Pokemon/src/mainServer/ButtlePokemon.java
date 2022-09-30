package mainServer;

import java.util.Map;

import mainServer.Action;
import mainServer.SimplePokemon;

public class ButtlePokemon extends SimplePokemon {
	
	int buttleHP;
    int action1;
    int action2;
    int action3;
    int action4;
	private Map<Integer, Action> actions;
//    Map<Integer, Action> actions;

    /**
     * バトル用ポケモンのコンストラクタ。バトル用HPの初期値はHPとする
     * @param pokemonID
     * @param pokemonName
     * @param HP
     */
    public ButtlePokemon(int buttleHP,int pokemonID,String pokemonName,int att,int dif,int spe,int type) {
        super(pokemonID,pokemonName,buttleHP);
    }


    public int getButtleHP() {
        return buttleHP;
    }
    public void setButtleHP(int buttleHP) {
        this.buttleHP = buttleHP;
    }
    public int getAction1() {
        return action1;
    }
    public void setAction1(int action1) {
        this.action1 = action1;
    }
    public int getAction2() {
        return action2;
    }
    public void setAction2(int action2) {
        this.action2 = action2;
    }

    public int getAction3() {
        return action3;
    }
    public void setAction3(int action3) {
        this.action3 = action3;
    }
    public int getAction4() {
    	return action4;
    }
    public void setAction4(int action4) {
    	this.action4 = action4;
    }


    public Map<Integer, Action> getActions() {
        return actions;
    }
    public void setActions(Map<Integer, Action> actions) {
        this.actions = actions;
    }


	public int getButtleHp() {
		// TODO Auto-generated method stub
		return 0;
	}

}
