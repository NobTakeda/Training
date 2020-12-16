public class Dice{
	public static void main(String[] args){

		int diceA = new java.util.Random().nextInt(6)+1;
		int diceB = new java.util.Random().nextInt(6)+1;
		int diff=Math.abs(diceA-diceB);/*diffは差という意味。abs(absolute)で絶対値を求めることができる*/
		System.out.println("Aさんがサイコロを振ったよ "+diceA);
		System.out.println("Bさんがサイコロを振ったよ "+diceB);

		if(diceA == diceB){
			System.out.println("引き分け");
		}else if(diceA > diceB){
			System.out.println("Aさんの"+diff"ポイント勝ちだよ");
		}else{
			System.out.println("Bさんの"+diff+"ポイント勝ちだよ");
		}
		/*ここから和*/
		if((diceA+diceB) % 2 == 0){
			System.out.println("二人の和は偶数です");
		}else{
			System.out.println("二人の和は奇数です");
		}
		/*ここから大きい目*/
	
	}
}
