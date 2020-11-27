import java.util.*;
public class PencilApp{
	public static void main(String[] args){
		System.out.print("何色の鉛筆を作りますか>");
		String name=new Scanner(System.in).nextLine();
		Pencil p1=new Pencil(name);
		int doPencil=0;	
		while(doPencil!=3){
		System.out.print("操作を入力してください 1...書く,2...情報を見る,3...終了>");
		doPencil=new Scanner(System.in).nextInt();
			if(doPencil==1){
				p1.drawPencil();
			}else if(doPencil==2){
				p1.pencilInfo();
			}else{}
		}
		System.out.println("アプリケーションを終了します。");
	}
}
