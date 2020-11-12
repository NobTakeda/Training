import java.util.*;
public class mondai{
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

		int index=0;
		int count=0;
		boolean target=false;
		int[] ans=new int[10];
		for(int i=0;i<numsA.length;i++){
			if(numsA[i]==numsB[i]){
				count++;
				index=i;
				System.out.printf("index[%d],",index);
				ans[i]=numsA[i];
				target=true;
			}
		}
		if(target==false){
			System.out.println("一致するindexはありませんでした。");
		}else{
			System.out.printf("の合計%dつが一致しています。%n",count);
		}
		for(int i=0;i<numsA.length-1;i++){
			for(int j=i+1;j<numsA.length;j++){
				if(ans[i]!=0 && numsA[i] > numsA[j]){
					int temp=numsA[i];
					numsA[i]=numsA[j];
					numsA[j]=temp;
				}
			}
		}
		for(int i=0;i<ans.length;i++){
			if(ans[i]!=0){
				System.out.printf("index[%d]:%d%n",i,ans[i]);
			}
		}
	}
}	
	

