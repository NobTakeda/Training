import java.util.*;
public class MethodLesson10{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("消費税は何%ですか>");
		int tax=sc.nextInt();
		int sumPrice=0;
		while(true){
			System.out.print("価格を入力(0でお会計)>");
			int price=sc.nextInt();
			if(price==0){
				break;
			}else{
				sumPrice+=price;
			}
		}
		System.out.println("お買い物合計金額は"+taxInPlice(sumPrice,tax)+"円です。");
	}
	static int taxInPlice(int price,int tax){
//		int totalPrice=0;
//		totalPrice=price+(price*tax/100);
		double ratio=1+(tax/100.0);
		return (int)(price*ratio);
	}
}
