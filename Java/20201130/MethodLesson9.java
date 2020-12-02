import java.util.*;
public class MethodLesson9{
	static double calcBMI(double weightKg,double heightCm){
		double heightM=heightCm/100;
		return weightKg/(heightM*heightM);
		//変数名で何をしているか説明する！！
		//double bmi=weightKg/(heightCm/100*heightCm/100);
		//return bmi;
	}
	public static void main(String[] args){
		Scanner sc=new scanner(System.in);
		System.out.print("体重を入力してください(Kg)>");
		double weight=sc.nextDouble();
		System.out.print("身長を入力してください(cm)>");
		double height=sc.nextDouble();
		System.out.printf("%.1fkg,%.1fcmのbmiは%.1fです。%n",weight,height,calcBMI(weight,height));
	}
}
