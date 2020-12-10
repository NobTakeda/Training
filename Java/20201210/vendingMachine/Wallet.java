import java.util.*;
public class Wallet{
	private int money;

	public Wallet(int money){
		this.money=money>0 ? money:0;
	}
	public void insertMoney(int money){
		this.money+=money;
	}
	public int takeOutMoney(int money){
		int taken=this.money>money ? money:this.money;
		System.out.println("財布から"+taken+"円取出しました。");
		this.money-=taken;
		return taken;
	}
	public void display(){
		System.out.println("現在の財布の中身:"+this.money+"円");
	}
	public int getMoney(){
		return this.money;
	}
	public void setMoney(int money){
		this.money=money;
	}
}
