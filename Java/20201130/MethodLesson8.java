public class MethodLesson8{
	static int largeOf(int a,int b){
		if(a>=b){
			return a;
		}else{
			return b;
		}
	}
	static double rectArea(double height,double width){
		return height*width;
	}
	static boolean isEven(int n){
		return n%2==0;
	}
	public static void main(String[] args){
		System.out.println(largeOf(10,20));
		System.out.println(rectArea(10.0,15.0));
		int x=10;
		if(isEven(x)){
			System.out.println(x+"は偶数");
		}else{
			System.out.println(x+"は奇数");
		}
	}
}
