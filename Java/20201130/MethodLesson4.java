public class MethodLesson4 {
	//String型の引数を一つ受け取りそれの先頭に★を出力するメソッド
	static void midashiMaker(String title){
		System.out.println("★"+title);
	}
	public static void main(String[] args) {
		//メソッドに実引数として"大見出し1"という文字列を渡して実行
		midashiMaker("大見出し1");
		System.out.println("内容");
		midashiMaker("大見出し2");
		System.out.println("内容");
		midashiMaker("大見出し3");
		System.out.println("内容");
	}
}
