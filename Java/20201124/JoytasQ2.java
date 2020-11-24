import java.util.*;//https://joytas.net/programming/java/method-lesson
public class JoytasQ2{
	public static void main(String[] args){
	}
	static char[] createAlphSrr(char first,int num){
		char[] alphArr=new char[num];
		for(int i=0;i<alphArr.length;i++){
			alphArr[i]=(char)(first+i);
		}
		return alphArr;
	}
}
