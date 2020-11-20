import java.util.*;
public class MethodQ3{
	public static void main(String[] args){
		System.out.print("体重を入力してください(kg)>");
		double wK=new Scanner(System.in).nextDouble();
		System.out.print("身長を入力してください(cm)>");
		double hC=new Scanner(System.in).nextDouble();
		System.out.printf("体重:%.1fkg,身長:%.1fcmのBMIは%.1fです。",wK,hC,calcBMI(wK,hC));
	}
	static double calcBMI(double weightKg,double heightCm){
		double bmi= weightKg / ((heightCm/100) * (heightCm/100));
		return bmi;
	}
}
