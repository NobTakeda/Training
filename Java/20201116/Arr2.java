import java.util.*;
public class Arr2{
	public static void main(String[] args){
		int[][] data1={
		{15,23,12},
		{4,11,23,55},
		{10,21},//最後に,があっても文法的にはOK
		};
		int[] nums={3,4,5,6,};//むしろ後のためにつけておくことが多い
		System.out.println(data1[1][2]);//23を出力となる

		int[][] data2=new int[3][];
		data2[0]=new int[]{15,34,12};
		data2[1]=new int[]{21,3,4,12};
		data2[2]=new int[]{12,34};
		System.out.println(data2[2][1]);//34を出力となる

		int[][] data3=new int[3][];
		data3[0]=new int[3];
		data[0][0]=15;
		data[0][1]=34;
		data[0][2]=12;
		data3[1]=new int[4];
		data3[2]=new int[2];
	}
}
