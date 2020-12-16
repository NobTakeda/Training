public class finalLesson{
	public static void main(String[] args){
		final double PI=3.14;
		double r=5.0;
		//PI=3.1415;    これを記述するとfinalで指定したものを再定義するのでエラーになる
		double area=r*r*PI;
		System.out.println("半径"+r+"の円の\n面積は\""+area+"\"です");
	}
}
