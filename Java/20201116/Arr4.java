import java.util.*;
public class Arr4{
	public static void main(String[] args){
		System.out.print("n(1~9)?>");
		int num=new Scanner(System.in).nextInt();
		int[][] kuku=new int[num][num];
		for(int i=0;i<kuku.length;i++){
			for(int j=0;j<kuku.length;j++){
				kuku[i][j]=(i+1)*(j+1);
				if(j==kuku.length-1){
					System.out.printf("%2d%n",kuku[i][j]);
				}else{
					System.out.printf("%2d|",kuku[i][j]);
				}
			}
		}
	}
}
