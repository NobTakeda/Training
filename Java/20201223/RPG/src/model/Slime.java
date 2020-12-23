package model;
public class Slime extends Monster{

	public Slime(String name) {
		super(name);
	}
	@Override
	public String run() {
		String str=this.getName()+"はサササっと逃げ出した！";
		return str;
	}
}
