public class Code4_1{
	public static void main(String[] args){
		int[] subs={20,30,40,50,80};
		int sum=0;
		for(int n :subs){
			sum += n;
		}
		int avg=sum/subs.length;
		System.out.println("合計点"+sum);
		System.out.println("平均点"+avg);
	}
}
