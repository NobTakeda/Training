import java.util.*;
public class Janken{
	public static void main(String[] args){
		System.out.print("手を入力 0.グー、1.チョキ、2.パー>");
		int h=new Scanner(System.in).nextInt();//変数名をuserHandとするとわかりやすい
		String[] hands={"グー","チョキ","パー"};
		int num=new Random().nextInt(hands.length);//変数名をpcHand
			
		/*int diff=(userHand +3 -pcHand) % 3;
		if(diff == 0){
			System.out.println("あいこです");
		}else if(diff ==1){
			System.out.println("あなたの負けです");
		}else{
			System.out.println("あなたの勝ちです");
		}*/

		if(h==num){
			System.out.printf("PCは%s。あいこです",hands[num]);
		}else if(h==0 && num==1){
			System.out.printf("PCは%s。あなたの勝ちです%n",hands[num]);
		}else if(h==1 && num==2){
			System.out.printf("PCは%s。あなたの勝ちです%n",hands[num]);
		}else if(h==2 && num==0){
			System.out.printf("PCは%s。あなたの勝ちです%n",hands[num]);
		}else{
			System.out.printf("PCは%s。あなたの負けです%n",hands[num]);
		}
	}
}
