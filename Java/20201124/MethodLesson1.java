public class MethodLesson1{ //オーバーロードについて
	public static void main(String[] args){
	}
	public static int add(int x,int y){
		return x+y;
	}
	public static double add(double x,double y){
		return x+y;
	}
	public static String add(String x,String y){
		return x+y;
	}
	public static int add(int x,int y,int z){
		return x+y+z;
	}
	//public static int add(int a,int b){} //引数の組み合わせが同じ
	//public static void add(int x,int y){} //戻り値は関係なし
}
