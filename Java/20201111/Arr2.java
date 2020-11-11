import java.util.*;
public class Arr2{
	public static void main(String[] args){
		int[] arr1={4,6,1,8};
		int[] arr2={3,9,2,5};
		int[] arr3=new int[4];

		for(int i=0;i<arr1.length;i++){
			if(arr1[i] > arr2[i]){
				arr3[i] = arr1[i];
			}else if(arr1[i] < arr2[i]){
				arr3[i] = arr2[i];
			}else{
				arr3[i] = arr1[i];
			}
		}
		System.out.println(Arrays.toString(arr3));
	}
}
