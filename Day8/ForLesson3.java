public class ForLesson3{
	public static void main(String[] args){
		System.out.print("ある整数を入れてください>");
		int min=new java.util.Scanner(System.in).nextInt();
		System.out.print("先程より大きい整数を入れてください>");
		int max=new java.util.Scanner(System.in).nextInt();

		int sum=0;//合計を管理する変数
		for(int i=min; i<=max; i++){
			sum += i;
		}
		System.out.printf("%dから%dまで足すと%dです。",min,max,sum);
	}
}
