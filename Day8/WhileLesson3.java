public class WhileLesson3{
	public static void main(String[] args){
		int temp=30;
		do{
			temp--;
			System.out.println("温度を1度下げました");
		}while(temp > 25);
			System.out.println("現在の音頭は"+temp+"度です");
	}
}
