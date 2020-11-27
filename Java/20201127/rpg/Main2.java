public class Main2{
	public static void main(String[] args){
		Hero h1=new Hero("ロト");
		System.out.println(h1.name);
		System.out.println("HP"+h1.hp);
		Hero h2=new Hero("ジェシカ",80);
		System.out.println(h2.name);
		System.out.println("HP"+h2.hp);
	}
}
