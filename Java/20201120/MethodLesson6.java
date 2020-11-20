import java.util.*;
public class MethodLesson6{
	public static void main(String[] args){
		System.out.print("文字列を入力してください>");
		String str=new Scanner(System.in).nextLine();
		String ans=decoration(str);
		System.out.println(ans);
	}
	//戻り値のあるメソッド
	static String decoration(String a){
		return "***"+a+"***";
	}
}
