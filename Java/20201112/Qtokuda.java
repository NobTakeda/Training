import java.util.*;
public class Qtokuda{
	public static void main(String[] args){
		System.out.print("何人ですか>");
		int num=new Scanner(System.in).nextInt();
		int[] nums=new int[num];
		for(int i=0;i<num;i++){
			System.out.printf("%d人目の点数>",i+1);
			nums[i]=new Scanner(System.in).nextInt();
		}
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
