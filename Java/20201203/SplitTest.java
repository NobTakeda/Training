import java.util.*;
public class SplitTest{
		public static void main(String[] args){
				if(args.length > 0){//これが無いと実行時の引数がなかった場合エラーになる
					String[] data=args[0].split(",");
					System.out.println(Arrays.toString(data));
					int sum=0;
					for(String s:data){
						sum+=Integer.parseInt(s);
					}
					/*for(int i=0;i<data.length;i++){
						sum+=Integer.parseInt(data[i]);
					}*/
				}
				System.out.println("引数の合計は"+sum+"です");
		}
}
