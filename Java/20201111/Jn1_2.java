import java.util.*;
public class Jn1_2{
	public static void main(String[] args){
		System.out.print("0~9までのランダムな値を生成します>");
		int r=new Random().nextInt(10);
		System.out.printf("値%dは%sです%n",r,r%2==0 ? "偶数":"奇数");
	}
}
