public class Hero{
	String name;//フィールド
	int hp=100;

	public Hero(){}//これが無く下のコンストラクタだけの場合、名前なしでHero生成ができない
	public Hero(String name){
		this.name=name;
	}
	public Hero(String name,int hp){
		this(name);//他のコンストラクタ（ここでは上のやつ）を呼び出して処理させている。
		this.hp=hp;//コンストラクタの呼び出しは1行目に書くこと（1コンストラクタに1個しかできない）
	}//コンストラクタでコンストラクタを呼び出すのを連続する処理はできる。

	public void sleep(){
		this.hp=100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	public void sit(int sec){
		this.hp+=sec;
		System.out.println(this.name+"は、"+sec+"秒座った！");
		System.out.println("HPが"+sec+"ポイント回復した");
	}
	public void slip(){
		this.hp-=5;
		System.out.println(this.name+"は毒をうけた！");
		System.out.println(this.name+"に5のダメージ！");
	}
	public void run(){
		System.out.println(this.name+"は逃げだした！");
		System.out.println("GameOver");
		System.out.println("最終HPは"+this.hp+"でした。");
	}
}
