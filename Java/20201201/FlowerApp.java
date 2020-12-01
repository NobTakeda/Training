import java.util.*;
public class FlowerApp{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("何色の花にしますか？>");
		String color=scan.nextLine();
	//String color=new Scanner(System.in).nextLine();
		System.out.print("種をいくつ植えますか？>");
		int num=new Scanner(System.in).nextInt();
		Flowerbed2 f1=new Flowerbed2(color,num);

	//	boolean isFinish=true;
		while(true){
			System.out.print("何をしますか？ 1...水汲み 2...水撒き 3...花壇を見る 4...終了>");
			int todo=new Scanner(System.in).nextInt();
			switch(todo){
			case 1:
				f1.drawWater();
				break;
			case 2:
				f1.waterFlower();
				break;
			case 3:
				f1.showStatus();
				break;
		//	case 4:
		//		isFinish=false;
		//		break;
			default:
				System.out.println("アプリケーションを終了します。");
				return;
			}
		}
	}
}
