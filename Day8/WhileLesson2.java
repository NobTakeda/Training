public class WhileLesson2{
	public static void main(String[] args){
		System.out.print("何回気合を入れますか？>");
		int kiai=new java.util.Scanner(System.in).nextInt();
		int x=0;
		while(x < kiai){
			x++;
			System.out.println("エイエイオー");
		}
		if(x == 0){
			System.out.println("やる気があるんですか？");
		}else if(x <=3){
			System.out.println(x+"回気合を入れました。そこそこのやる気ですね");
		}else{
			System.out.println(x+"回気合を入れました。やる気充分ですね！");
		}
	}
}
