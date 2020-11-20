import java.util.*;
public class MethodQ2{
	public static void main(String[] args){
		System.out.print("文字列を入力してください>");
		String str=new Scanner(System.in).nextLine();
		System.out.print("整数を入力してください>");
		int num=new Scanner(System.in).nextInt();
		if(num <= 0){
			System.out.println("入力が不正です");
		}
		System.out.println(lineUpStr(str,num));
	}
	static String lineUpStr(String str,int num){
		String strs="";
		for(int i=0;i<num;i++){
			strs+=str;
		}
		return strs;
	}
}
