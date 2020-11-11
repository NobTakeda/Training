import java.util.*;
public class Ball99{
	public static void main(String[] args){
		int[] balls=new int[99];
		boolean[] isPicked=new boolean[99];
		int tempA=0;
		int tempB=0;
		int sumA=0;
		int sumB=0;

		for(int i=0;i<50;i++){
			int ran=new Random().nextInt(balls.length-i);
			tempA=ran;
			balls[balls.length-1-i]=ran;
			isPicked[isPicked.length-1-i]=true;

			while(true){
				ran=new Random().nextInt(balls.length-i);
				if(isPicked[ran]){
					continue;
				}else{
					break;
				}
			tempB=ran;
			isPicked[ran]=true;		
			
			System.out.println((i+1)+"回戦");
			if(tempA<tempB){
				System.out.printf("A:%d,B:%d...Bの勝ち%n",tempA,tempB);
				sumB++;
			}else{
				System.out.printf("A:%d,B:%d...Aの勝ち%n",tempA,tempB);
				sumA++;
			}
		}
		if(sumA==sumB){
		System.out.printf("%d対%dで引き分け",sumA,sumB);
		}else if(sumA>sumB){
		System.out.printf("%d対%dでAの勝ち",sumA,sumB);
		}else{
		System.out.printf("%d対%dでBの勝ち",sumA,sumB);
		}
		}
	}
}
