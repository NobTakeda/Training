import java.util.*;
public class MethodLesson2{
	public static void main(String[] args){
/*		System.out.print("あなたの名前を入れてください>");
		String namae=new java.util.Scanner(System.in).nextLine();
		hello(namae);*/
		System.out.print("整数を入力>");
		int num=new Scanner(System.in).nextInt();
		evenOrOdd(num);
	}
/*	static void hello(String name){
		System.out.println(name+"さん、Hello");*/
		static void evenOrOdd(int n){
			System.out.printf("%dは%sです%n",n,n%2==0? "偶数":"奇数");
	/*		if(num%2==0){
				System.out.println(num+"は偶数です");
			}else{
				System.out.println(num+"は奇数です");
			}*/
		}
}
