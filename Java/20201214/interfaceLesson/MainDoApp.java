import java.util.*;
public class MainDoApp extends App{
	public static void main(String[] args){
		List<App> appList=new ArrayList<>();
		DoApp pc=new DoApp();
		appList.add(new Excel());
		appList.add(new Word());
		appList.add(new PowerPoint());
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("0.アプリ実行,1.アプリ選択,2.終わり>");
			int select=sc.nextInt();
			switch(select){
				case 0:
					pc.execApp();
					break;
				case 1:
					System.out.println("どのアプリを実行しますか0.エクセル、1.ワード、2.パワポ>");	
					int index=sc.nextInt();
					App appli=appList.get(index);
					pc.choiceApp(appli);
					break;
				default:
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
	}
}
