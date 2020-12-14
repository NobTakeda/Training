import java.util.*;
import java.io.*;
public class Lesson1{
	public static void main(String[] args) throws Exception{
		FileWriter fw=new FileWriter("data.txt",true);//ファイルがなくても自動で作ってくれる
		//trueがあると追加書き込み、ないと上書きになる
		fw.write("hello!");
		fw.close();
	}
}
