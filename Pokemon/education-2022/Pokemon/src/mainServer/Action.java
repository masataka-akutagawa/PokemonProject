package mainServer;

public class Action {

	int actionID;
	String actionName;
	int attack;
	int type;
	boolean count;
	
	
	
	public Action(int actionID,String actionName,int attack,int type, boolean count) {
		// TODO Auto-generated constructor stub
		this.actionID = actionID;
		this.actionName = actionName;
		this.attack = attack;
		this.type = type;
		this.count = count;
}
		
	
	public int getActionID() {
		return actionID;
	}
	public void setActionID(int actionID) {
		this.actionID = actionID;
	}

	public String getActionName() {
		return actionName;
	}
	
	public void setName(String actionName) {
		this.actionName = actionName;
	}
	
	public int getAttack() {
		return attack;
	}
	
	public void setAttack(int attack) {
		this.attack = attack;
	}
	
	public int getType() {
		return type;
	}
	
	public void setType(int type) {
		this.type = type;
	}
	
	public boolean getCount() {
		return count;
	}
	
	public void setCount(boolean count) {
		this.count = count;
	}

	
	
}
