package model;
public class DeathBat extends Monster{

	public DeathBat(String name) {
		super(name);
	}
	@Override
	public String run() {
		String str=this.getName()+"はバサバサと逃げ出した";
		return str;
	}
}
