public class Archer{
	private static int totalArcher;
	private int no;

	public Archer(){
		this.no=totalArcher+1;
		System.out.println("Archer"+this.no+"を生成しました。");
		totalArcher++;
	}
	public static int getTotalArcher(){
		return totalArcher;
	}
	public void shootArrow(){
		System.out.println("Archer"+this.no+"は矢を放った!");
	}
}
