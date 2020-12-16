public class ScopeLesson{
	public static void main(String[] args){
		int x=10;
		int y=0;//ここに初期値を入れていないとコンパイルエラー
		if(x ==10){
				y=100;
				System.out.printf("xは%d,yは%dです%n",x,y);
			}else{//このelse文を書いている場合、int y=0を宣言しなくてもコンパイルが通る
				y=200;
			}
		System.out.println(y);//int yをif文の外で宣言していない場合コンパイルエラー
	}
}
