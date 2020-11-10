import java.util.*;
public class Ball2{
	public static void main(String[] args){
		int[] balls={1,2,3,4,5};
		for (int i=0;i<balls.length;i++){
			int index=new Random().nextInt(balls.length-i);//-iを入れることでRandom範囲が狭まる
			System.out.println(balls[index]);
			int temp=balls[index];
			balls[index]=balls[balls.length-1-i];
			balls[balls.length-1-i]=temp;
		}
	}
}
