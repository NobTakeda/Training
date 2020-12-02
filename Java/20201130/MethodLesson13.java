import java.util.*;
public class MethodLesson13 {
	//第一引数にint型配列を受け取り、その要素を第二引数倍にした要素をもつ新しい配列を返却するメソッド
	static int[] timesArray(int[] arr, int times) {
		//引数で渡ってきた配列と同じ要素数の配列をメモリ空間に新しく作成
		int[] retArr = new int[arr.length];
		//新しい配列の要素に引数で渡ってきた要素をtimes倍した値を入れる。
		for (int i = 0; i < retArr.length; i++) {
			retArr[i] = arr[i] * times;
		}
		//新しく作成した配列(のアドレス)を返却
		return retArr;
	}

	public static void main(String[] args) {
		// [1,2,3]を要素とする配列をメモリ空間に作成し、その時のアドレスをarr1は保持
		int[] arr1 = new int[] { 1, 2, 3 };
		// timesArrayによって新しく作られた配列を受け取る
		int[] arr2 = timesArray(arr1, 2);
		// arr1はそのまま[1,2,3]
		System.out.println(Arrays.toString(arr1));
		// arr2は[2,4,6]
		System.out.println(Arrays.toString(arr2));
		//要素を3倍にした新しい配列のアドレスを受け取る
		int[] arr3 = timesArray(arr2, 3);
		// arr3は[6,12,18]
		System.out.println(Arrays.toString(arr3));
	}
}


