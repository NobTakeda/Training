import java.util.*;
public class PoolApp{
		public static void main(String[] args){
				Pool p1=new Pool();
				Scanner sc=new Scanner(System.in);
				while(true){
						System.out.print("1. 給水 / 2. 排水 / 3. 表示 / 4. 終了 >");
						int todo=sc.nextInt();
						switch(todo){
						case 1:
								System.out.print("給水する水量を入力してください");
								double water=sc.nextDouble();
								p1.feedWater(water);
								break;
						case 2:
								System.out.print("排水する水量を入力してください");
								water=sc.nextDouble();
								p1.drainWater(water);	
								break;
						case 3:
								p1.display();
								break;
						default:
								System.out.println("アプリケーションを終了します");
								return;
						}
				}
		}
}
