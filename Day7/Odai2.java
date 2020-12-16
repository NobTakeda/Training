public class Odai2{
	public static void main(String[] args){
		System.out.print("底辺>");
		double bottom=new java.util.Scanner(System.in).nextDouble();
		System.out.print("高さ>");
		double height=new java.util.Scanner(System.in).nextDouble();
		double area=(bottom * height)/2;

		System.out.println("底辺"+bottom+",高さ"+height+"の三角形の面積は"+area+"です！");
		System.out.printf("底辺%.1f,高さ%.1fの三角形の面積は%.1fです！\n",bottom,height,area);
	}
}
