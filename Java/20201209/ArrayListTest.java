import java.util.*;
public class ArrayListTest{
	public static void main(String[] args){
		ArrayList<Integer> points=new ArrayList<Integer>();
		points.add(10);
		points.add(80);
		points.add(75);
		points.add(90);
		points.add(0,25);//index[0]に挿入
		//points.set(3,50);//index[3]を50に書き換え
		int removed=points.set(3,50);//25,10,80,50,90
		//points.set(3,50)だけだと書き換えるだけだが、
		//int removedとセットで使うことで、元の値を格納しておくことができる
		System.out.println("index1は"+points.get(1));//10
		System.out.println("point.setで入れ替えた値は"+removed);//75
		System.out.println("******");
		for(int i:points){
			System.out.println(i);
		}
		System.out.println("******");
		for(int i=0;i<points.size();i++){
			System.out.println(points.get(i));
		}
		System.out.println("******");
		if(points.size()>2){
		}
		if(points.size()>0){
		}
		if(points.isEmpty()){
		}
		if(points.contains(90)){
		}
		System.out.println("80が入っているindexは"+points.indexOf(80));//2
		System.out.println("1000が入っているindexは（存在しない場合)"+points.indexOf(1000));//-1
		removed=points.remove(2);
		System.out.println(removed+"をremove");
		points.clear();


		Integer i1=Integer.valueOf(16);
		int i2=i1.intValue();

		String s1=String.valueOf(16);
		int i3=Integer.parseInt(s1);
	}
}
