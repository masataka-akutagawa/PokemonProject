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
			new Ability("����������",5,"�m�[�}��",false),
			new Ability("�����ӂ��т�",3,"�m�[�}��",true),
			new Ability("����",5,"�݂�",false),
			new Ability("�݂��ł��ۂ�",7,"�݂�",false)
			
	};
	Ability[] ability2 = {
			new Ability("����������",5,"�m�[�}��",false),
			new Ability("�^�l�}�V���K��",3,"����",true),
			new Ability("���̂�",5,"����",false),
			new Ability("�͂��σJ�b�^�[",7,"����",false)
		};
	Ability[] ability3 = {
			new Ability("����������",5,"�m�[�}��",false),
			new Ability("�����ӂ��т�",3,"�m�[�}��",true),
			new Ability("�Ђ̂�",5,"�ق̂�",false),
			new Ability("�����񂮂��",7,"�ق̂�",false)
		};
	Ability[] ability4 = {
			new Ability("����������",5,"�m�[�}��",false),
			new Ability("�ɂǂ���",3,"�����Ƃ�",true),
			new Ability("�ǂ납��",5,"���߂�",false),
			new Ability("�n�C�p�[�{�C�X",8,"�m�[�}��",false)
		};
	Ability[] ability5 = {
			new Ability("����������",5,"�m�[�}��",false),
			new Ability("�����ӂ��т�",3,"�m�[�}��",true),
			new Ability("�ł񂫃V���b�N",5,"�ł�",false),
			new Ability("10�܂�{���g",8,"�ł�",false)
		};
	Ability[] ability6 = {
			new Ability("10�܂�{���g",8,"�ł�",false),
			new Ability("�ꂢ�Ƃ��r�[��",8,"������",false),
			new Ability("�����̂ڂ�",8,"�݂�",false),
			new Ability("��イ�̂͂ǂ�",9,"�h���S��",false)
		};

}
