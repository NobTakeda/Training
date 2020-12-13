import java.util.*;
public class MapTest{
	public static void main(String[] args){
		Map<String,Integer> prefs=new HashMap<>();
		prefs.put("京都府",255);
		prefs.put("東京都",1261);
		prefs.put("熊本県",181);

		int tokyo=prefs.get("東京都");//keyを指定し値を取得
		System.out.println("東京都の人口は、"+tokyo);
		prefs.remove("京都府");
		prefs.put("熊本県",182);//熊本県を182で上書き
		int kumamoto=prefs.get("熊本県");
		System.out.println("熊本県の人口は、"+kumamoto);

		for(String key:prefs.keySet()){//拡張for文で、keyの集合体をまず取り出す
			int value=prefs.get(key);
			System.out.println(key+"の人口は"+value);
		}
	}
}
