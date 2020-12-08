public class Slime{
	String name;

	public Slime(String name){
		this.name=name;
		System.out.println(this.name+"があらわれた！");
	}
	public void attack(){
		System.out.println(this.name+"の攻撃:5ポイントのダメージを与えた！");
	}
}
