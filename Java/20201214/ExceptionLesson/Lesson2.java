import java.util.*;
import java.io.*;
public class Lesson2{
	public static void main(String[] args) throws Exception{
		FileWriter fw=null;//ファイルがなくても自動で作ってくれる
		//trueがあると追加書き込み、ないと上書きになる
		try{
			fw=new FileWriter("data.txt",true);
			fw.write("hello!");
		}catch(Exception e){
			System.out.println("何らかの例外が発生しました");
		}finally{
			if(fw !=null){
				try{
					fw.close();
				}catch(IOException e){
					;
				}
			}
		}
	}
}
