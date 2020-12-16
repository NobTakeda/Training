public class ForLesson4{
	public static void main(String[] args){
		System.out.print("サイコロを何回振りますか？>");
		int x=new java.util.Scanner(System.in).nextInt();
		double sum=0;
		int min=6;
		int max=0;

		for(int i=0; i<x; i++){
			int dice=new java.util.Random().nextInt(5)+1;
			System.out.println("出目は"+dice);
			sum += dice;

			if(max <dice){
				max=dice;
			}
			if(dice<min){
				min=dice;
			}
		}
	
		System.out.println("合計は"+sum);
		System.out.println("最小値は"+min);
		System.out.println("最大値は"+max);
		double ave=sum/x;
		System.out.printf("平均は%.2f%n",ave);
	}
}
