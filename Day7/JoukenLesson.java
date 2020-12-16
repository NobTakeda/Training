public class JoukenLesson{
	public static void main(String[] args){
		System.out.print("あなたの性別を入れてください(男,女)");
		String gender =new java.util.Scanner(System.in).nextLine();
		System.out.print("あなたの年齢を入力してください");
		int age =new java.util.Scanner(System.in).nextInt();

		/*boolean isOK=(gender.equals("男") && age >=18)
								||(gender.equals("女") && age >=16)
		if(isOK){
			System.out.println("あなたは結婚できます");
		}else{
			System.out.println("あなたはまだ結婚できません");
		}このような書き方もできる*/

		if(gender.equals("男") && age >= 18 
			||
			gender.equals("女") && age >=16){//&&より||の方が優先順位が高いので&&の要素に()が無くても成立する。()があった方がもちろんわかりやすい

		/*if(str.equals("男") && age >= 18){
			System.out.println("あなたは結婚できます");
		}
		else if(str.equals("女") && age >= 16){
			System.out.println("あなたは結婚できます");
		}*/
			System.out.println("あなたは結婚できます");
		}else{
			System.out.println("あなたはまだ結婚できません");
		}
	}
}
