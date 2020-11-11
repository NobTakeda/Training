public class ArrLessonKaitou{
	public static void main(String[] args){ 
//ここで配列を全部表示しておく。

		System.out.println();

		int target=77;
		int i=0;
		for(;i<nums.length;i++){
			if(nums[i]==target){
			System.out.printf("最初の%dのindexは%dです。%n",target,i);
			break;
			}
		}
		if(i==nums.length){
			System.out.println("77はありませんでした");
		}
	}
}
