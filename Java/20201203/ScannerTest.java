import java.util.*;
public class ScannerTest{
		public static void main(String[] args){
				Scanner sc=new Scanner(System.in);
				System.out.print("あなたの好きな数字は>");
				//nextIntの後にnextLineを実行する場合、
				//改行を空読みさせなければ上手く動かない。
				int num=sc.nextInt();sc.nextLine();
				/*
				int num2=sc.nextInt();
				int num3=sc.nextInt();
				System.out.println("num:"+num);
				System.out.println("num2:"+num2);
				System.out.println("num3:"+num3);
				*/
				System.out.print("お名前>");
				String name=sc.nextLine();
				System.out.printf("%sさんの好きな数字は%dですね%n",name,num);
				
		}
}
