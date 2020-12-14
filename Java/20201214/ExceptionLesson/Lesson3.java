import java.util.*;
import java.io.*;
public class Lesson3{
	public static void main(String[] args){
		try(FileWriter fw=new FileWriter("data.txt",true);){
			//ファイルがなくても自動で作ってくれる
			//trueがあると追加書き込み、ないと上書きになる
			fw.write("hello!");
		}catch(Exception e){
			System.out.println("何らかの例外が発生しました");	
		}
	}
}
