import java.util.Scanner;

public class second {
	public static void main(String[] args) {
		System.out.print("1~10000の数値を入力してください>");
		Scanner sc=new Scanner(System.in);
		sc.close();
		String str=sc.nextLine();
		System.out.print("逆にしました->");
		for(int i=(str.length()-1);i>=0;i--){
			System.out.print(str.charAt(i));
		}
		System.out.println();
	}
}
