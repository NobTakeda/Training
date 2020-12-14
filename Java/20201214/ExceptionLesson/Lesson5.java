import java.util.*;
public class Lesson5{
	public static void main(String[] args){
		int[] nums={10,20,30,40,};
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("indexを指定(qで終了)>");
			String str=sc.nextLine();
			if(str.equalsIgnoreCase("q")){
				System.out.println("終了");
				return;
			}
			try{
				int index=Integer.parseInt(str);
				System.out.println(nums[index]);
			}catch(ArrayIndexOutOfBoundsException e){
				System.out.println("error:数値は0~"+(nums.length-1));
			}catch(NumberFormatException e){
				System.out.println("error:1,2...のような数値で入力");
			}
		}
	}
}
