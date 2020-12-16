public class Self{
	public static void main(String[] args){
		System.out.print("お名前を入力してください>");
		String name=new java.util.Scanner(System.in).nextLine();
		System.out.print("年齢を入力してください>");
		int age=new java.util.Scanner(System.in).nextInt();

		//System.out.println("ようこそ"+name+"("+age+")さん！");
		System.out.printf("ようこそ%s(%d)さん！\n",name,age);
	}
}
