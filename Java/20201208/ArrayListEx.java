import java.util.*;
public class ArrayListEx{
	public static void main(String[] args){
		ArrayList<Integer> list=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("要素追加するよ、数字を入れてね(0で終了):");
			int select=sc.nextInt();
			if(select==0){
				System.out.println("---結果---");
				System.out.println("要素数:"+list.size());
				System.out.print("要素:");
				for(Integer i:list){
					System.out.print(i+",");
				}
				System.out.println();
				return;
			}else{
				list.add(select);
				System.out.println(select+"をListに追加したよ！");
			}
		}
	}
}
