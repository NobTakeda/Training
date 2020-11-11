import java.util.*;
public class Saku3{
	public static void main(String[] args){
		int[] nums=new int[10];
		for(int i=0;i<nums.length;i++){
			int n=new Random().nextInt(10);
			nums[i]=n;
		}
		System.out.println(Arrays.toString(nums));

		for(int i=0;i<nums.length-1;i++){
			for(int j=i+1;j<nums.length;j++){
				if(nums[i] > nums[j]){
					int temp=nums[i];
					nums[i]=nums[j];
					nums[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
