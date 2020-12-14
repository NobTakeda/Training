import java.util.*;
public class MusicApp{
	public static void main(String[] ags){
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("音楽ファイル名>");
			String str=sc.nextLine();
			if(str.contains(".")){
				isCanOpen(str);
			}else{
				System.out.println("アプリケーションを終了します");
				return;
			}
		}
	}
	static void isCanOpen(String str){
		String[] findFile=str.split(".");
		String errorMsg="未対応のファイルです";
		UnsupportedMusicFileException e1=new UnsupportedMusicFileException(errorMsg);
		if(findFile[1].equals("mp3") || findFile[1].equals("wav") || findFile[1].equals("ogg") || findFile[1].equals("aiff")){
			System.out.println(str+"を再生します");
		}else{
			System.out.println(e1.msg);
		}
	}
}
class UnsupportedMusicFileException extends Exception{
	public UnsupportedMusicFileException(String msg){
		super(msg);
	}
}
