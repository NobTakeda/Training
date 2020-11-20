public class MethodLesson{
	static void eat(){
		System.out.println("もぐもぐ");
		System.out.println("ゴクゴク");
	}
	public static void main(String[] args){
		hello("田中");	
		hello("佐藤");
		eat();
		bye();
	}
	static void hello(String name){
		System.out.println(name+"さん、Hello");
	}
	static void bye(){
		System.out.println("Bye");
	}
}
