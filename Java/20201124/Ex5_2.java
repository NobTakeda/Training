public class Ex5_2{
	public static void main(String[] args){
		String title="こんにちは";
		String addres="新宿三丁目";
		String text="今あなたの後ろにいます";
		email(title,addres,text);
	}
	static void email(String title,String addres,String text){
		System.out.println(addres+"に、以下のメールを送信しました");
		System.out.println("件名"+title);
		System.out.println("本文"+text);
	}
}
