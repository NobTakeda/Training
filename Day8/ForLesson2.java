public class ForLesson2{
	public static void main(String[] args){
		System.out.print("気合を何回入れますか？>");
		int kiai=new java.util.Scanner(System.in).nextInt();

		for(int i=0; i<kiai; i++){
			System.out.println("エイエイオー！");
		}
		System.out.println(kiai+"回気合を入れました。やる気充分ですね！");
	}
}
