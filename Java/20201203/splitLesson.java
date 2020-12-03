import java.util.*;
public class splitLesson{
		public static void main(String[] args){
				String str="りんご,みかん,ばなな";//CSVデータ カンマセパレーテッドヴァリュー
				String[] data=str.split(",");
				System.out.println(Arrays.toString(data));
		}
}
