import java.util.*;
public class BookApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		//ここでbook1生成
		System.out.println("本のページ数を入力してください>");
		int page=sc.nextInt();
		System.out.println("本の価格を入力してください>");
		int price=sc.nextInt();
		Book book1=new Book(page,price);
		//ここでnote1生成
		System.out.println("ノートのページ数を入力してください>");
		page=sc.nextInt();
		System.out.println("ノートの価格を入力してください>");
		price=sc.nextInt();
		NoteBook note1=new NoteBook(page,price);
		
		int select=0;
		while(true){
			System.out.print("1. 本の情報表示 / 2. ノートの情報表示 / 3. ノートに追加書込 / 4. 終了 >");
			select=sc.nextInt();sc.nextLine();
			switch(select){
				case 1:
					book1.showBook();
					break;
				case 2:
					note1.showBook();
					break;
				case 3:
					System.out.println("書き込む内容を表示してください >");
					String contents=sc.nextLine();
					note1.writeToNote(contents);
					break;
				default:
					System.out.println("アプリケーションを終了します。");
					return;
			}
		}
	}
}
