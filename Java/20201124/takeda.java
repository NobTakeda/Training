import java.util.*;
public class takeda{
	public static void main(String[] args){
		System.out.println("どうする？1...円状に配置する 0...直線状に配置する>");
		int num=new Scanner(System.in).nextInt();
		boolean form=true;
		String condition="円状";
		if(num==0){
			form=false;
			condition="直線状";
		}else if(num!=1){
			System.out.println("Error:不正な値です");
			return;
		}
		System.out.print("盆栽の数を入力してください>");
		int bonsaiNum=new Scanner(System.in).nextInt();
		int mossBall=circleOrLine(bonsaiNum,form);
		System.out.printf("%sに%d個配置する時、必要な苔玉は%d個です。%n",condition,bonsaiNum,mossBall);
	}
	static int circleOrLine(int bonsaiNum,boolean isRound){
		int result=0;
		if(isRound==true){
			result=bonsaiNum;
		}else{
			result=bonsaiNum-1;
		}
		return result;
	}
}
