public class Sample2{
	public static void main(String[] args){
		int x=7;
		int y=3;
		//丸括弧が必須なことに注意
		System.out.println("x+y="+(x+y));
		System.out.println("x*y="+x*y);
		//int割るintはintであることに注意
		System.out.println("x/y="+x/y);
		//剰余演算子（余りを求める)
		System.out.println("x%y="+x%y);
		x=x+3;
		System.out.println(x);//x->10
		x=x%4;
		System.out.println(x);//x->2
		x+=5;
		System.out.println(x);//x->7 x=x+5と同じ意味
		x-=6; // x=x-6
		System.out.println(x);//x->1 x=x-6と同じ意味
		x%=3;
		System.out.println(x);//x->1 x=x%3と同じ
		x*=10;
		System.out.println(x);//x->10 x=x*10と同じ
		//インクリメント
		x++;
		System.out.println(x);//x+=1 x=x+1と同じ
		//デクリメント
		x--;
		System.out.println(x);//x-=1 x=x-1と同じ
		String firstName="Taro";
		System.out.println(firstName);//Taro
		String lastName="Yamada";
		System.out.println(lastName);//Yamada
		String fullName=lastName + firstName;
		System.out.println(fullName);//YamadaTaro
	}
}







