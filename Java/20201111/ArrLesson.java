import java.util.*;
public class ArrLesson{
	public static void main(String[] args){
		int[] nums=new int[100];
		boolean[] first=new boolean[100];
		int min=0;
		for(int i=0;i<nums.length;i++){
			nums[i]=new Random().nextInt(100);
			System.out.print(nums[i]+",");
			if(first[i]==true){	
				break;
			}else if(nums[i]==77){
				min=i;
				first[i]=true;
			}
		}
		if(min==0){
			System.out.println("77はありませんでした");
		}else{
			System.out.printf("最初の77のindexは%dです。",min);
		}
	}
}
