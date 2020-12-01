public class MethodLesson3{
		//＊を20個並べて出力し改行する処理
	static void printLine(){
		for(int i=0;i<20;i++){
			System.out.print("*");
			}
		System.out.println();
	}

	public static void main(String[] args) {
		printLine();
		System.out.println("見出し1");
		System.out.println("見出し1の内容");
		printLine();
		System.out.println("見出し2");
		System.out.println("見出し2の内容");
		printLine();
		System.out.println("見出し3");
		System.out.println("見出し3の内容");
		printLine();
	}
}
