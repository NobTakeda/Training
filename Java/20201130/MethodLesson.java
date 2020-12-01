public class MethodLesson{
	//ゲームstart時の処理をまとめたメソッド
	static void gameStart(){
		System.out.println("点数を0で初期化");
		System.out.println("startボタンを表示");
	}
	//ゲームのメイン処理を書いたメソッド
	static void gameMain(){
		System.out.println("ゲームのメイン処理");
	}
	//ゲーム終了時の処理をまとめたメソッド
	static void gameEnd(){
		System.out.println("スコアをDBに記録");
		System.out.println("retryボタンを表示");
	}
	//メインメソッドからそれぞれの処理を呼び出す
	public static void main(String[] args){
		gameStart();
		gameMain();
		gameEnd();
	}
}
