import java.util.*;
public class ArrLesson2{
	public static void main(String[] args){
		int[] nums=new int[10];
		String[] ans=new String[10];
//		boolean[] targets=new boolean[10];

		for(int i=0;i<nums.length;i++){
			int n=new Random().nextInt(10);
			nums[i]=n;
			System.out.printf(n+",");
			ans[i]=n%2==0 ? "偶数":"奇数";
//			if(nums[i]%2==0){
//				targets[i]=true;
			
		}
		System.out.println();
//		for(int i=0;i<nums.length;i++){
//			ans[i]=targets[i]==true ? "偶数":"奇数";
//		}
		System.out.println(Arrays.toString(ans));
	}
}
