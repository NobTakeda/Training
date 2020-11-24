import java.util.*;//https://joytas.net/programming/java/method-lesson
public class JoytasQ3{
	public static void main(String[] args){
	}
	static boolean[] isSame(int[] nums){
		int first=nums[0];
		for(int i=0;i<nums.length;i++){
			if(first != nums[i]){
				return false;
			}
		}
		return true;
	}
}
