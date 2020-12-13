import java.util.*;
import java.io.*;
public class Camp{
	public static void main(String[] args) throws Exception{
		FileInputStream fis=new FileInputStream("data.csv");
		InputStreamReader isr=new InputStreamReader(fis,"utf-8");
		BufferedReader br=new BufferedReader(isr);
		String line;
		Map<String> nameData=new HashMap<>();
		Map<String> shopData=new HashMap<>();
		int count=0;
		int totalMoney=0;
		while((line = br.readLine()) != null){
			String[] data=line.split(",");
			for(int i=0;i<3;i++){
				str.add((i),data[i]);
			}
			totalMoney+=Integer.parseInt(str.get(count);
			count++;
		}
		br.close();
		System.out.println("csvデータ");
		System.out.println("---------");
		for(int i=0;i<str.length;i++){
			System.out.println(Arrays.toString(str[i]));
		}
		System.out.println("*********");
		System.out.println("キャンプ会計");
		System.out.println("---------");
		for(int i=0;i<str.length;i++){
			System.out.printf("%s:%s%n",str[i][1],str[i][2]);
		}
		System.out.println("---------");
		System.out.println("合計"+totalMoney+"円");
		System.out.println("*********");

		int average=totalMoney/str.length;
		System.out.println("個別会計(一人当たり:"+average+"円");
		System.out.println("---------");
		for(int i=0;i<str.length;i++){
			if(str[i][2]==average){
				System.out.println(str[i][1]+":0");
			}else if(str[i][2]>average){
				System.out.printf("%s:+%d%n",)
			}else{
			}
		}
	}
}
