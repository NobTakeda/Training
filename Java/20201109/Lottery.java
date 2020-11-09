public class Lottery{
	public static void main(String[] args){
		long sum=0;
		for(int i=0;i<3;i++){
			System.out.print("くじを引いてください>Enter");
			new java.util.Scanner(System.in).nextLine();
			int ran=new java.util.Random().nextInt(100)+1;
			System.out.println((i+1)+"回目");
			if(ran > 40){
				System.out.println(ran);
				System.out.println("ハズレ");
			}else if(ran > 20){
				System.out.println(ran);
				System.out.println("6等100円");
				sum+=100;
			}else if(ran > 10){
				System.out.println(ran);
				System.out.println("5等1000円");
				sum+=1000;
			}else if(ran > 6){
				System.out.println(ran);
				System.out.println("4等1万円");
				sum+=10000;
			}else if(ran > 3){
				System.out.println(ran);
				System.out.println("3等10万円");
				sum+=100000;
			}else if(ran >1){
				System.out.println(ran);
				System.out.println("2等100万円");
				sum+=1000000;
			}else{
				System.out.println(ran);
				System.out.println("1等1000万円");
				sum+=10000000;
			}
		}
		System.out.printf("獲得賞金は%,d円でした！%n",sum);
	}
}
