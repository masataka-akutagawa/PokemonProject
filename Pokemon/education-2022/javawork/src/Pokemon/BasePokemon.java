package Pokemon;

import javawork.Ability;

public abstract class BasePokemon implements Pokemon {
	
	protected int hp = 0;
	protected int atk = 0;
	protected int def = 0;
	protected int speed = 0;
	protected String type = "";
	protected String name = "";
	
	
	public BasePokemon(int hp,int atk,int def,int speed,String type,String name) {
		
		this.hp = hp;
		this.atk = atk;
		this.def = def;
		this.speed = speed;
		this.type = type;
		this.name = name;
		
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	Ability[] ability1 = {
			new Ability("たいあたり",5,"ノーマル",false),
			new Ability("おうふくびんた",3,"ノーマル",true),
			new Ability("あわ",5,"みず",false),
			new Ability("みずでっぽう",7,"みず",false)
			
	};
	Ability[] ability2 = {
			new Ability("たいあたり",5,"ノーマル",false),
			new Ability("タネマシンガン",3,"くさ",true),
			new Ability("このは",5,"くさ",false),
			new Ability("はっぱカッター",7,"くさ",false)
		};
	Ability[] ability3 = {
			new Ability("たいあたり",5,"ノーマル",false),
			new Ability("おうふくびんた",3,"ノーマル",true),
			new Ability("ひのこ",5,"ほのお",false),
			new Ability("かえんぐるま",7,"ほのお",false)
		};
	Ability[] ability4 = {
			new Ability("たいあたり",5,"ノーマル",false),
			new Ability("にどげり",3,"かくとう",true),
			new Ability("どろかけ",5,"じめん",false),
			new Ability("ハイパーボイス",8,"ノーマル",false)
		};
	Ability[] ability5 = {
			new Ability("たいあたり",5,"ノーマル",false),
			new Ability("おうふくびんた",3,"ノーマル",true),
			new Ability("でんきショック",5,"でんき",false),
			new Ability("10まんボルト",8,"でんき",false)
		};
	Ability[] ability6 = {
			new Ability("10まんボルト",8,"でんき",false),
			new Ability("れいとうビーム",8,"こおり",false),
			new Ability("たきのぼり",8,"みず",false),
			new Ability("りゅうのはどう",9,"ドラゴン",false)
		};

}
