public class mondai{
		public static void main(String[] args){
			System.out.println("あなたの年齢を入力してください");
			String ageString=new java.util.Scanner(System.in).nextLine();

			int age =Integer.parseInt(ageString);
			if (age >= 20){
				System.out.println("貴方は大人です");
			}else{
				System.out.println("あなたはこどもです");
			}
		}
	}
