import java.util.Arrays;//この記述でArraysから始められる。java.util.*;で全コマンドOK
public class ArrLesson3{
	public static void main(String[] args){
		int[] dataA = { 3, 5, 10 };//宣言と同時なら配列の中身を列挙して宣言できる
		int[] dataB=new int[] {4,6,10};//この書き方は2行に分けてはできない
		int[] hoge;
		hoge=new int[]{2,5};//このようにすれば2行で宣言できる
		String[] strs={"hoge","fuga","bar"};
		double[] nums={1.1,2.2,3.3};
		boolean[] bools={false,false,true,true};
		

		for(int i=0;i<dataA.length;i++){
			System.out.println(dataA[i]);
		}
		for(int j=0;j<strs.length;j++){
			System.out.println(strs[j]);
		}
		//拡張for文
		for(int n:dataB){
			System.out.println(n);
		}
		for(String s:strs){
			System.out.println(s);
		}
		System.out.println(Arrays.toString(dataA));
		
	}
}
