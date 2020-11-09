public class ArrLesson1{
	public static void main(String[] args){
		int[] nums=new int[3];//new int[3]で3つぶんの数を扱う配列と宣言。初期値は0となる。
		System.out.println(nums.length);//配列名.lengthで要素数を教えてくれる

		System.out.println(nums[0]);//indexは[]でくくった数字で指す
		System.out.println(nums[1]);
		System.out.println(nums[2]);

		nums[0]=10;//配列numsのindex[0]に10を代入 
		nums[1]=20;
		nums[2]=30;

		System.out.println(nums[0]);

		nums[0]=nums[1]+nums[2];
		System.out.println(nums[0]);
	}
}
