import java.util.*;
public class SlimeApp{
	public static void main(String[] args){
		ArrayList<Slime> slimes=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("スライムを追加する？(1...yes,2...no):");
			int select=sc.nextInt();sc.nextLine();
			switch(select){
				case 1:
					System.out.print("追加するスライムの名前を決めてね:");
					String name=sc.nextLine();
					Slime s=new Slime(name);
					slimes.add(s);
					break;
				default:
					for(int i=0;i<slimes.size();i++){
						slimes.get(i).attack();
					}
					return;
			}
		}
	}
}
