import java.util.*;
public class ArcherApp2{
	public static void main(String[] args){
		Archer[] archers=new Archer[10];
		for(int i=0;i<archers.length;i++){
			archers[i]=new Archer();
		}
		System.out.print("アーチャー番号を入力(1~10):");
		int select=new Scanner(System.in).nextInt();
		archers[select-1].shootArrow();
	}
}
