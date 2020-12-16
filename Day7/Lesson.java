public class Lesson{
	public static void main(String[] args){
		int a=10,b=20;
		if(a == b){
			System.out.println(a +"と" +b+ "は等しいです");
		}
		if(a != b){
			System.out.println(a +"と"+b+"は等しくないです");
		}
		if(a > b){
			System.out.println(a +"は"+b+"より大きいです");
		}
		if(a < b){
			System.out.println(a +"は"+b+"より小さいです");
		}
		//以下はコンパイルエラーとなる
		//if(a=10){}
		//if(5){} javaの場合これは駄目
		//if(a=b){}
		//if(){}
		String str="Hello";
		//文字列の比較はequals()を使う
		if (str.equals("Hello")){
			//処理の記述
		}
		if(!str.equals("Hello")){
			//処理の記述
		}
		if(a > 0 && b > 0){
		}
		if(a < 0 || b > 100){
		}
		if(a == 10 && str.equals("Hello")){
		}
	}
}



