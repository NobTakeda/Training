import java.util.*;
public class MethodQ4{
	public static void main(String[] args){
		System.out.println("****TriangleCalculator****");
		System.out.println("どうする？ 1...三角形の面積を求める 0...やめる");
		int start=new Scanner(System.in).nextInt();
		if(start==1){
			System.out.print("底辺を入力してください>");
			double bot=new Scanner(System.in).nextDouble();
			System.out.print("高さを入力してください>");
			double hei=new Scanner(System.in).nextDouble();
			System.out.printf("底辺:%.2f,高さ%.2fの三角形の面積は%.2fです。",bot,hei,triArea(bot,hei));
		}else if(start==0){
			System.out.println("アプリケーションを終了します");
		}else{
			System.out.println("不正な値です");
		}
	}
	static double triArea(double bottom,double height){
		double area=bottom * height / 2;
		return area;
	}
}
