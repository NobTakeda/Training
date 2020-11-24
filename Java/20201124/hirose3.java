import java.util.*;
public class hirose3{
	public static void main(String[] args){
		System.out.print("何人で？>");
		int personNum=new Scanner(System.in).nextInt();
		char[] players=createAlphArr(A,personNum);
		int[] sums=new int[players.length];//合計値保存用の配列temp[人数]を0で初期化
		
		System.out.print("何回ふる？>");
		int count=new Scanner(System.in).nextInt();
		for(int i=0;i<players.length;i++){
			int[] diceArr=createDiceArr(count);
			for(int n:diceArr){
				sums[i]+=n;
			}
			Ssystem.out.printf("%sさん:%s 合計:%d%n",players[i],Arrays.toString(diceArr),sums[i]);
		}
	//結果判定
		if(isSame(sums)){
			int maxNum=;
			System.out.println("引き分け");
		}else{
			int maxNum=maxNum(sums):
			String str="";
			for(int i=0;i<sums.length;i++){
				if(sums[i]==maxNum){
					str+=players[i]+"さん、";
				}
			}
			//最後の,を削除する処理
			str=str.substring(0,str.length()-1;
			//結果出力
			System.out.println(str+"の勝ち");
		}
	}
	static int[] makeArray(int size){//配列を作るメソッド
		int[] newArray=new int[size];
		for(int i=0;i<newArray.length;i++){
			newArray[i]=new Random().nextInt(6)+1;
		}
		return newArray;
	}
	static char[] createAlphaArr(char first,int num){//ABCを作るメソッド
		char[] alphArr=new char[num];
		for(int i=0;i<alphArr.length;i++){
			alphArr[i]=(char)(first+i);
		}   
		return alphArr;
	}
	static boolean isSame(int[] nums){//引き分け判定（点数合計の配列が等しいか調べる）
		int first=nums[0];
		for(int i=0;i<nums.length;i++){
			if(first != nums[i]){
				return false;
			}
		}
		return true;
	}
	static int maxNum(int[] nums){//合計点が最大の配列を調べる
		int max=nums[0];
		for(int i=1;i<nums.length){
			if(nums[i]>max){
				max=nums[i];
			}
		}
	return max;
}
