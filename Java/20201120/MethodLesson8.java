import java.util.*;
public class MethodLesson8{
	public static void main(String[] args){
		int year=0;
		int day=0;
		System.out.print("何月ですか？>");
		int month=new Scanner(System.in).nextInt();
		System.out.printf("%d月の日数は%d日です。",month,days(month));
	}
	static int days(int i){
		int day=0;
		if(i==2){
			day=28;
		}else if(i==4 || i==6 || i==9 || i==11){
			day=30;
		}else{
			day=31;
		}
		return day;
	}
}
