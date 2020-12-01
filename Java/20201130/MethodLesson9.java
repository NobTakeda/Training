import java.util.*;
public class MethodLesson9{
	static double calcBMI(double weightKg,double heightCm){
		double bmi=weightKg/(heightCm/100*heightCm/100);
		return bmi;
	}
	public static void main(String[] args){
		System.out.print("体重を入力してください(Kg)>");
		double weight=new Scanner(System.in).nextDouble();
		System.out.print("身長を入力してください(cm)>");
		double height=new Scanner(System.in).nextDouble();
		System.out.printf("%.1fkg,%.1fcmのbmiは%.1fです。%n",weight,height,calcBMI(weight,height));
	}
}
