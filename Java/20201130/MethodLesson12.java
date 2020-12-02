import java.util.*;
public class MethodLesson12{
	public static void main(String[] args){
		int[] arr={1,2,3,4,5};
		arrReverse(arr);
		System.out.println(Arrays.toString(arr));
	}
	static void arrReverse(int[] arr){
		for(int i=0;i<arr.length/2;i++){
			int temp=arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
		}
	}
}
