import java.util.*;
public class Arr1{
	public static void main(String[] args){
		int[][] nums=new int[3][4];
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				int element=new Random().nextInt(100)+1;
				nums[i][j]=element;
				System.out.printf("%4d",nums[i][j]);
			}
			System.out.println();
		}
	}
}
