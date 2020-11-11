import java.util.*;
public class Saku2{
	public static void main(String[] args){
		char[] chars={'H','E','L','L','O'};
		char c;//この場合変数名は一般的にtemp
		for(int i=0;i<chars.length/2;i++){
			c=chars[i];
			chars[i]=chars[chars.length-1-i];
			chars[chars.length-1-i]=c;
		}
		System.out.println(Arrays.toString(chars));
	}
}
