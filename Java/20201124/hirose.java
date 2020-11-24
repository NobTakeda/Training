import java.util.*;
public class hirose{
	public static void main(String[] args){
		System.out.print("何回ふる？>");
		int size=new Scanner(System.in).nextInt();
		int[] AdiceNums=makeArray(size);//配列を作成
		int[] BdiceNums=makeArray(size);
		int sumA=0;
		int sumB=0;
		for(int i=0;i<AdiceNums.length;i++){//配列の数字を合計
			sumA+=AdiceNums[i];
		}
		for(int i:BdiceNums){
			sumB+=i;
		}
		System.out.println("Aさん:"+Arrays.toString(AdiceNums)+"合計:"+sumA);
		System.out.println("Bさん:"+Arrays.toString(BdiceNums)+"合計:"+sumB);

		if(sumA==sumB){
			System.out.println("引き分け");
		}else if(sumA>sumB){
			System.out.println("Aさんの勝ち");
		}else{
			System.out.println("Bさんの勝ち");
		}
	}
	static int[] makeArray(int size){
		int[] newArray=new int[size];
		for(int i=0;i<newArray.length;i++){
			newArray[i]=new Random().nextInt(6)+1;
		}
		return newArray;
	}
}
