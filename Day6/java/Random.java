public class Random{
	public static void main(String[] args){
		int test=new java.util.Random().nextInt(101);

		if(test >= 80){
			System.out.println(test+"点は優です");
		}else if(test >=60){
			System.out.println(test+"点は良です");
		}else if(test >=40){
			System.out.println(test+"点は可です");
		}else{
			System.out.println(test+"点は不可です");
		}
	}
}
