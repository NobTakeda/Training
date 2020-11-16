import java.util.*;
public class Arr3que{
	public static void main(String[] args){
		String[] whgame={"いつ","誰が","どこで","何をした"};
		String[][] data=new String[whgame.length][];
		for(int i=0;i<whgame.length;i++){
			System.out.printf("%sはいくつ>",whgame[i]);
			int whgameNum=new Scanner(System.in).nextInt();
			data[i]=new String[whgameNum];
			for(int j=0;j<data[i].length;j++){
				System.out.printf("%sを入れて>",whgame[i]);
				data[i][j]=new Scanner(System.in).nextLine();
			}
		}
		String[] seps={"","が","で",""};//separatersの略
		for(int i=0;i<whgame.length;i++){
			int ran=new Random().nextInt(data[i].length);
			System.out.print(data[i][ran]+seps[i]);
/*			if(i==1){
				System.out.printf("%sが",data[i][ran]);
			}else if(i==2){
				System.out.printf("%sで",data[i][ran]);
			}else{
				System.out.printf("%s",data[i][ran]);
			}*/

		}
		System.out.println();
	}
}
