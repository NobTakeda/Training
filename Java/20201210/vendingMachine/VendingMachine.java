import java.util.*;
public class VendingMachine{
	private int money;
	private int num;

	public VendingMachine(int n){
		this.money=0;
		this.num=n;
	}
	public void insertCoins(int money){
		this.money+=money;
	}
	public int cancel(){
		int cancelMoney=this.money;
		if(this.money<=0){
			System.out.println("自販機にお金は入っていません");
			cancelMoney=0;
		}else{
			System.out.println(cancelMoney+"円返却しました");
			this.money-=cancelMoney;
		}
		return cancelMoney;
	}
	public void purchase(){
		if(this.num==0){
			System.out.println("商品売切");
		}else if(this.money<100){
			System.out.println("投入金額が足りません");
		}else{
			System.out.println("商品を買いました");
			if(this.money>100){
				this.money-=100;
				this.num--;
			}else{
				this.money-=100;
				this.num--;
			}
		}
	}
	public void insertGoods(int n){
		this.num+=n;
		System.out.println(n+"個の商品を補充しました");
	}
	public int getMoney(){
		return this.money;
	}
	public void setMoney(int money){
		this.money=money;
	}
	public int getNum(){
		return this.num;
	}
	public void setNum(int num){
		this.num=num;
	}
}
