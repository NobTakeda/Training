import java.util.*;
public class VendingApp{
	public static void main(String[] args){
		Wallet w1=new Wallet(1000);
		VendingMachine v1=new VendingMachine(3);
		Scanner sc=new Scanner(System.in);
		System.out.println("現在の入金額"+v1.getMoney()+"円");
		while(true){
			System.out.print("1. 硬貨投入 / 2. 商品購入 / 3. 硬貨取出 / 4. 商品補充 / 5.所持金表示 / 6.終了>");
			int select=sc.nextInt();
			switch(select){
				case 1:
					System.out.println("投入する金額を入力してください>");
					int num=sc.nextInt();
					int taken=w1.takeOutMoney(num);
					v1.insertCoins(taken);
					System.out.println("**********");
					System.out.println("現在の入金額"+v1.getMoney()+"円");
					break;
				case 2:
					if(v1.getNum()==0){
						v1.purchase();
					}else{
						v1.purchase();
						int cancelMoney=v1.cancel();
						w1.insertMoney(cancelMoney);
					}
					System.out.println("**********");
					System.out.println("現在の入金額"+v1.getMoney()+"円");
					break;
				case 3:
					int cancelMoney=v1.cancel();
					w1.insertMoney(cancelMoney);	
					System.out.println("**********");
					System.out.println("現在の入金額"+v1.getMoney()+"円");
					break;
				case 4:
					System.out.println("投入する個数を選択してください>");
					num=sc.nextInt();
					v1.insertGoods(num);
					System.out.println("**********");
					System.out.println("現在の入金額"+v1.getMoney()+"円");
					break;
				case 5:
					w1.display();
					System.out.println("**********");
					break;
				default:
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
	}
}
