import java.util.*;
public class Qtakeda{
	public static void main(String[] args){
		int[] numsA=new int[10];
		for(int i=0;i<numsA.length;i++){
			int num=new Random().nextInt(5)+1;
			numsA[i]=num;
		}	
		int[] numsB=new int[10];
		for(int i=0;i<numsB.length;i++){
			int num=new Random().nextInt(5)+1;
			numsB[i]=num;
		}	
		System.out.println(Arrays.toString(numsA));
		System.out.println(Arrays.toString(numsB));
		//ここまででnumsAとnumsBの出力終わり

		int index=0;
		int count=0;
		boolean target=false;//一致するindexが存在するか判断する変数
		for(int i=0;i<numsA.length;i++){
			if(numsA[i]==numsB[i]){
				count++;
				index=i;
				System.out.printf("index[%d],",index);
				target=true;
			}
		}
		if(target==false){
			System.out.println("一致するindexはありませんでした。");
		}else{
			System.out.printf("の合計%dつが一致しています。%n",count);
		}
	}
}
