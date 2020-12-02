import java.util.*;
public class MethodLesson11{
	static void timesArray(int[] arr,int times){
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i]*times;
		}
	}
	public static void main(String[] args){
		//[1,2,3]を要素とする配列をメモリ空間に作成し、その時のアドレスをarr1は保持
		int[] arr1=new int[]{1,2,3};
		//timesArrayにそのアドレスを渡す
		timesArray(arr1,2);
		//arr1にある配列の内容が書き換わったことを確認
		System.out.println(Arrays.toString(arr1));
		//さらにarr1の内容を3倍する
		timesArray(arr1,3);
		//arr1の値がさらに3倍されたことを確認
		System.out.println(Arrays.toString(arr1));
	}
}
