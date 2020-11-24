import java.util.*;
public class hirose2{
	public static void main(String[] args){
		System.out.print("何人で？>");
		int member=new Scanner(System.in).nextInt();
		System.out.print("何回ふる？>");
		int size=new Scanner(System.in).nextInt();
		int[] temps=new int[member];//合計値保存用の配列temp[人数]を0で初期化
		System.out.println("************");

		for(int i=0;i<temps.length;i++){
			int sum=0;
			int[] diceNums=makeArray(size);
			for(int j=0;j<diceNums.length;j++){//ダイスの数字を合計
				sum+=diceNums[j];
			}
			System.out.println((i+1)+"番目:"+Arrays.toString(diceNums)+"合計:"+sum);
			temps[i]=sum;

			if(i==(temps.length-1) && judgeDraw(temps)==true){
				System.out.println("************");
				System.out.println("引き分け");
			}else if(i==(temps.length-1)){
				System.out.println("************");
				System.out.println(winOrLose(temps)+"番目の勝ち！");
			}
		}
	}
	static int[] makeArray(int size){//配列を作るメソッド
		int[] newArray=new int[size];
		for(int i=0;i<newArray.length;i++){
			newArray[i]=new Random().nextInt(6)+1;
		}
		return newArray;
	}
	static boolean judgeDraw(int[] temps){//引き分けか判断するメソッド
		boolean judge=true;
		for(int i=1;i<temps.length;i++){
			if(temps[i-1]!=temps[i]){
				judge=false;
			}
		}
		return judge;
	}
	static String winOrLose(int[] points){//一番大きい数字を判断し、その人を文字列に追加
		String result="";
		int max=points[0];
		for(int i=1;i<points.length;i++){
			max=Math.max(max,points[i]);
		}
		for(int i=0;i<points.length;i++){
			if(points[i]==max){
				result+="["+(i+1)+"]";
				}
		}
		return result;
	}
}
