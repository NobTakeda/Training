public class Ex5_4{
	public static void main(String[] args){
		double bottom=10.0;
		double height=23.0;
		System.out.printf("三角形の底辺%.1fcm,高さ%.1fcmの場合、面積は%.2f㎠%n",bottom,height,calcTriangleArea(bottom,height));
		double radius=5.5;
		System.out.printf("円の半径が%.1fcmの場合、面積は%.2f㎠%n",radius,calcCircleArea(radius));
	}
	static double calcTriangleArea(double bottom,double height){
		double area=bottom*height/2;
		return area;
	}
	static double calcCircleArea(double radius){
		double area=radius*radius*3.14;
		return area;
	}
}
