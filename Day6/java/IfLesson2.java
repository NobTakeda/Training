public class IfLesson2{
	public static void main(String[] args){
		/*
		System.out.print("あなたの年齢を入力してください");//printにlnをつけると改行して入力となる
		int age=new java.util.Scanner(System.in).nextInt();

		if (age >= 20){
			System.out.println("あなたは大人です");
		}else{
			System.out.println("あなたは子供です");
		}
		*/

		int diceA = new java.util.Random().nextInt(6);
		diceA++;
			System.out.println("Aさんがサイコロを振りました。出目は"+diceA);
		int diceB = new java.util.Random().nextInt(6);
		diceB++;
			System.out.println("Bさんがサイコロを振りました。出目は"+diceB);

		if(diceA < diceB){
			System.out.println("Bさんが勝ったよ");
		}else if(diceA > diceB){
			System.out.println("Aさんが勝ったよ");
		}else{
			System.out.println("引き分けだよ");
		}
/*ここから大きい目を表示する記述*/
		if(diceA < diceB){
			System.out.println("一番大きい目は"+diceB+"だよ");
		}else if(diceA > diceB){
			System.out.println("一番大きい目は"+diceA+"だよ");
		}else{
			System.out.println("一番大きい目は"+diceA+"だよ");
		}
/*ここから偶数奇数の判定*/
		int goukei = diceA + diceB;
		if(goukei%2 == 0){
			System.out.println("二人の目の和は偶数だったよ");
		}else{
			System.out.println("二人の目の和は奇数だったよ");
		}
	}
}
