public class Wizard{
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	void heal(Hero h){
		int basePoint=10;
		int recovPoint=(int)(basePoint*this.wand.getPower());
		h.setHp(h.getHp()+recovPoint);
		System.out.println(h.getName()+"のHPを"+recovPoint+"回復した！");
	}
	public int getHp(){
		return this.hp;
	}
	public int getMp(){
		return this.mp;
	}
	public String getName(){
		return this.name;
	}
	public Wand getWand(){
		return this.wand;
	}
	public void setHp(int hp){
		if(hp<0){
			this.hp=0;
		}else{
			this.hp=hp;
		}
	}
	public void setMp(int mp){
		if(mp<0){
			this.mp=0;
		}else{
			this.mp=mp;
		}
	}
	public void setName(String name){
		if(name==null || name.length()<3){
			throw new IllegalArgumentException("ウィザードに設定されようとしている名前が異常です");
		}
		this.name=name;
	}
	public void setWand(Wand wand){
		if(wand==null){
			throw new IllegalArgumentException("設定されようとしている杖がnullです");
		}
		this.wand=wand;
	}
}
