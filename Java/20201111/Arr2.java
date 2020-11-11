import java.util.*;
public class Arr2{
	public static void main(String[] args){
		int[] arr1={4,6,1,8};
		int[] arr2={3,9,2,5};
		int[] arr3=new int[4];

		for(int i=0;i<arr3.length;i++){
			arr3[i]=arr1[i]>arr2[i] ? arr1[i]:arr2[i];
			/*
			if(arr1[i] > arr2[i]){
				arr3[i] = arr1[i];
			}else{
				arr3[i] = arr2[i];
			}*/
		}
		System.out.println(Arrays.toString(arr3));
		System.out.printf("こういう配列ができました%s%n",Arrays.toString(arr3));
	}
}
