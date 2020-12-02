import java.util.*;
public class CopyMachineApp{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.print("最初に給紙する枚数を入力してください>");
		int sheet=scan.nextInt();
		CopyMachine m1=new CopyMachine(sheet);

		while(true){
			System.out.print("1. 給紙 / 2. コピー / 3. 表示 / 4. 終了>");
			int command=scan.nextInt();
			switch(command){
			case 1:
				System.out.print("給紙する枚数を入力してください>");
				sheet=scan.nextInt();
				m1.feedPaper(sheet);
				break;
			case 2:
				System.out.print("コピーする枚数を入力してください>");
				sheet=scan.nextInt();
				m1.copy(sheet);
				break;
			case 3:
				m1.display();
				break;
			default:
				System.out.println("アプリケーションを終了します。");
				return;
			}
		}
	}
}
