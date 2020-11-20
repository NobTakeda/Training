import java.util.*;
public class MethodLesson4{
	public static void main(String[] args){
		System.out.print("文字列を入力してください>");
		String a=new Scanner(System.in).nextLine();
		System.out.print("文字列を入力してください>");
		String b=new Scanner(System.in).nextLine();
		winOrLose(a,b);
	}
	static void winOrLose(String a,String b){
		if(a.length() == b.length()){
			System.out.println("引き分け");
		}else if(a.length() > b.length()){
			System.out.printf("%sの勝ち！%n",a);
		}else{
			System.out.printf("%sの勝ち！%n",b);
		}
	}
}
