public class Code2_13{
	public static void main(String[] args){
		String age="31"; //ここを「こんにちは」等にすると、コンパイルは通るが実行エラーとなる

		int n=Integer.parseInt(age);
		System.out.println("あなたは来年、"+(n+1)+"歳になりますね。");
	}
}
