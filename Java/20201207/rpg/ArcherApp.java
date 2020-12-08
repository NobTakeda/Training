import java.util.*;
public class ArcherApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("操作を入力してください 1...Archer作成,2...Archerの総数確認,3...終了>");
			int select=sc.nextInt();
			switch(select){
				case 1:
					Archer a1=new Archer();
					break;
				case 2:
					System.out.println("Archerクラスから"+Archer.getTotalArcher()+"人のアーチャーが生成されました。");
					break;
				default:
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
}
