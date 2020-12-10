import java.util.*;
public class SetEx{
	public static void main(String[] args){
		Set<String> colors=new HashSet<String>();
		String str="赤,青,黄,青,緑,緑,黒,白,青,ピンク,黄緑,白";
		String[] data=str.split(",");
		//Listからsetを生成
		//Set<String> set=new HashSet<>(Arrays.asList(data));
		for(String s:data){
			colors.add(s);
		}
		System.out.println("色は"+colors.size()+"種類");
		Systme.out.println(colors.contains("黒") ? "黒は含まれています":"黒は含まれていません");
		/*
		if(colors.contains("黒")){
			System.out.println("黒は含まれています");
		}else{
			System.out.println("黒は含まれていません");
		}
		*/

		//setからlistを生成
		List<String> list=new ArrayList<>(set);
		System.out.println(list.get(0));
	}
}
