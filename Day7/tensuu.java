public class Numeric{	
	public static void main(String[] args){

		System.out.print("点数を入力>");
		int ten=new java.util.Scanner(System.in).nextInt();
//↓でも良いが、不正な値を先に弾く記述方式の方が一般的かも
		if(ten >= 0 && ten <=100){
			System.out.println("あなたの点数は"+ten+"点です");
			System.out.printf("あなたの点数は%d点です%n",ten);
		}else{
		System.out.println("不正な値が入力されました");
		}
		//if(0 <= score && score <= 100) このような記述もできる
	}
}
