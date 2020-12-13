import java.io.*;
import java.util.*;
public class FileTest{
	public static void main(String[] args)throws Exception{
		FileInputStream fis=new FileInputStream("test.txt");
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		BufferedReader br=new BufferedReader(isr);

		String line;
		while((line=br.readLine()) !=null){//1行ずつ読み込んだ文章をlineに代入して、nullでない間
			System.out.println(line);
		}
		br.close();
	}
}
