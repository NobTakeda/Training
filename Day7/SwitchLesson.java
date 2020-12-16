public class SwitchLesson{
	public static void main(String[] args){
		System.out.print("月を入力してください>");
		int month=new java.util.Scanner(System.in).nextInt();

		switch(month){
			case 12:
			case 1:
			case 2:
				System.out.println(month+"月は冬です");
				break;
			case 3:
			case 4:
			case 5:
				System.out.println(month+"月は春です");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println(month+"月は夏です");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println(month+"月は秋です");
				break;
			default:
				System.out.println("不正な値です");
		}
	}
}
