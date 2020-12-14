public abstract class App{
	String name;
	public App(String name){
		this.name=name;
	}
	public abstract void doApp();
}
class Excel extends App{
	public Excel(String name){
		super(name);
	}
	@Override
	public void doApp(){
		System.out.println(this.name+"で表計算を実行した");
	}
}
class Word extends App{
	public Word(String name){
		super(name);
	}
	@Override
		public void doApp(){
			System.out.println(this.name+"で文章を作成した");
		}
}
class PowerPoint extends App{
	public PowerPoint(String name){
		super(name);
	}
	@Override
		public void doApp(){
			System.out.println(this.name+"でスライドを作成した");
		}
}

