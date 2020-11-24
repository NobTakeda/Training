import java.util.*;
public class JoytasQ1{
	public static void main(String[] args){
		System.out.print("サイコロを何個転がす？>");
		int diceNum=new Scanner(System.in).nextInt();
	}
	static int[] createDiceSrr(int count){
		int[] diceArr=new int[count];
		for(int i=0;i<diceArr.length;i++){
			diceArr[i]=new Random().nextInt(6)+1;
		}
		return diceArr;
	}
}
