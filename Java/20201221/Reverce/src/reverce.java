import java.util.Scanner;

public class reverce {
	public static void main(String[] args) {
		System.out.print("1~10000の数値を入力してください>");
		Scanner sc=new Scanner(System.in);
		sc.close();
		String str=sc.nextLine();
		int[] ans=new int[str.length()];
		int num=Integer.parseInt(str);
		for(int i=0;i<ans.length;i++) {
			ans[i]=(num%10);
			num/=10;
		}
		System.out.print("逆にしました->");
		for(int n:ans) {
			System.out.print(n);
		}
		System.out.println();
	}
}
