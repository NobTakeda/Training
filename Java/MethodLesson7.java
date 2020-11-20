import java.util.*;
public class MethodLesson7{
	public static void main(String[] args){
/*		System.out.print("整数を入力>");
		int a=new Scanner(System.in).nextInt();
		System.out.print("整数を入力>");
		int b=new Scanner(System.in).nextInt();
		System.out.println("大きい方は"+max(a,b));
	}
	static int max(int a,int b){ 
		return Math.max(a,b);*/
		System.out.print("文字列を入力してください>");
		String str=new Scanner(System.in).nextLine();
		System.out.print("整数を入力してください>");
		int num=new Scanner(System.in).nextInt();
		System.out.println(decorateStr(str,num));
		System.out.println(decorateStr("Hello",2));
		System.out.println(decorateStr("Hello",1));
	}
	static String decorateStr(String str,int num){
		if(num%2==0){
			return "***"+str+"***";
		}else{
			return "---"+str+"---";
		}
	}
	static void methodA(int a){
		if(a <0){
			return;
		}
		System.out.println(a);
	}
}
