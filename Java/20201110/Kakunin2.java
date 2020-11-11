import java.util.*;
public class Kakunin2{
	public static void main(String[] args){
		int[] nums=new int[5];
		for(int i=0;i<5;i++){
			int ran=new Random().nextInt(101);
			nums[i]=ran;
			System.out.printf("nums[%d]:%d%n",i,nums[i]);
		}
	}
}
