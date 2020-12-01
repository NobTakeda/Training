import java.util.*;
public class HitBlow{
	public static void main(String[] args){
		Random rand=new Random();
		Scanner scan=new Scanner(System.in);
		System.out.print("要素数(10以下)を入力してください>");
		int num=scan.nextInt();

		//入力された桁数ぶんhitBlowNumsを作成。
		int[] hitBlowNums=new int[num];
		int[] numbers={0,1,2,3,4,5,6,7,8,9};
		for(int i=0;i<num;i++){
			int index=rand.nextInt(numbers.length-i);
			int temp=numbers[index];
			hitBlowNums[i]=numbers[index];
			numbers[index]=numbers[numbers.length-1-i];
			numbers[numbers.length-1-i]=temp;
		}
	}
}
