import java.util.*;
public class CreateRanArr{
	public static void main(String[] args){
		/*int min=1;
		int max=9;
		int len=3;
		System.out.println(Arrays.toString(createRandomArr(min,max,len)));
		int[][] arr=createRandomArr(1,9,3,2);
		/*for(int i=0;i<arr.length;i++){
			System.out.println(Arrays.toString(arr[i]));
		}
		for(int[] arr:arr2){
				System.out.println(Arrays.toString(arr));
		}
		int[] arr2=createRandomArr(1,9,3);
		showArr(arr2);*/
		int[][]arr3=createRandomArr(1,9,7,3);
		showArr(arr3);
	}
	//配列を作るメソッド
	static int[] createRandomArr(int min,int max,int len){
		int[] nums=new int[len];
		Random rand=new Random();
		for(int i=0;i<nums.length;i++){
			nums[i]=rand.nextInt(max-min+1)+min;
		}
		return nums;
	}
	//↑のメソッドをオーバーロードして二次元配列を作るメソッド
	static int[][] createRandomArr(int min,int max,int len,int childLen){
		int[][] arr=new int[len][childLen];
		for(int i=0;i<arr.length;i++){
			arr[i]=createRandomArr(min,max,childLen);
		}
		/*int[][] arr=new int[len][childLen];
		Random rand=new Random();
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				arr[i][j]=rand.nextInt(max-min+1)+min;
			}
		}*/
		return arr;
	}
	//配列を出力するメソッド
	static void showArr(int[] arr){
		System.out.print("{");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+",");
		}
		System.out.println("}");
	}
	//↑のメソッドをオーバーロードして、二次元配列を出力するメソッド
	static void showArr(int[][] arr){
		System.out.println("{");
		for(int i=0;i<arr.length;i++){
			System.out.print(" ");
			showArr(arr[i]);
		}
		System.out.println("}");
	}
}
