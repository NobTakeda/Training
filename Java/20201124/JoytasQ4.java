import java.util.*;//https://joytas.net/programming/java/method-lesson
public class JoytasQ4{
	public static void main(String[] args){
	}
	static int maxNum(int[] nums){
		int max=nums[0];
		for(int i=1;nums.length;i++){
			if(nums[i]>max){
				max=nums[i];
			}
		}
		return max;
	}
}
