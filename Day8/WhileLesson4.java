public class WhileLesson4{
	public static void main(String[] args){

		final long DIST=384400000000L;
		int count=0;
		long thick=1L;
		while(thick<DIST){
			count++;
			thick *=2;
			System.out.println(count+"回折り曲げた。厚さ("+thick+")");
		}
		System.out.println(count+"回折り曲げたら月に到達します。");
	}
}
	/*	long x=1;
		long count=0;
		while(x < 384400000000L){//long型の場合は最後にLをつけること！
			x=x*2;
			count++;
			System.out.println(count+"回折り曲げた。厚みは("+x+")mm");
		}
		System.out.println(count+"回折り曲げたら月に届きました");
	}
}*/
