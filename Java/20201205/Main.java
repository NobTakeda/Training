import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Bicycle b1=new Bicycle();
		ElectricBicycle e1=new ElectricBicycle();
		
		while(true){
			System.out.println("自転車を選んでください");
			System.out.printf("0...自転車/ホイールサイズ:%d%n",b1.wheelSize);
			System.out.printf("1...電動自転車/ホイールサイズ:%d バッテリー:%d%n",e1.wheelSize,e1.battery);
			System.out.println("2...終了");
			System.out.print("番号を入力してください>");
			int select=sc.nextInt();
			boolean whichBike=true;
			switch(select){
				case 0:
					break;
				case 1:
					whichBike=false;
					break;
				default:
					System.out.println("アプリケーションを終了します。");
					return;
			}
			boolean todo=true;
			while(todo){
				System.out.print("1/走る,2/降りる,3/充電");
				select=sc.nextInt();
				switch(select){
				case 1:
					if(whichBike){
						b1.ride();
					}else{
						e1.ride();
					}
					break;
				case 2:
					System.out.println("自転車を降りました。");
					todo=false;
					break;
				case 3:
					e1.batteryCharge();
					break;
				}
			}
		}
	}
}
