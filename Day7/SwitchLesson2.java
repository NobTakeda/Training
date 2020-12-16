public class SwitchLesson2{
	public static void main(String[] args){

		System.out.print("1つ目の整数xの値を入力してください");
		int x=new java.util.Scanner(System.in).nextInt();
		System.out.print("2つ目の整数yの値を入力してください");
		int y=new java.util.Scanner(System.in).nextInt();
		System.out.print("演算子(+,-,*,/,%)を半角記号で入力してください");
		String s=new java.util.Scanner(System.in).nextLine();

		switch(s){
			case "+":
			System.out.printf("%d+%d=(%d)%n",x,y,(x+y));
			break;
			case "-":
			System.out.printf("%d-%d=%d%n",x,y,(x-y));
			break;
			case "*":
			System.out.printf("%d*%d=%d%n",x,y,(x*y));
			break;
			case "/":
			System.out.printf("%d/%d=%d%n",x,y,(x/y));
			break;
			case "%":
			System.out.printf("%d%%%d=%d%n",x,y,(x%y));//演算子%を文字列で表示させたい時は%%と表記する
			break;
			default:
			System.out.println("不正な値です");
		}
	}
}
