import java.util.*;
public class BuildApp{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		List<Building> buils=new ArrayList<Building>();
		while(true){
			System.out.print("1...ビルを建築, 2...風景を見る, 3...終了>");
			int select=sc.nextInt();
			switch(select){
				case 1:
					System.out.print("建物の幅>");
					int width=sc.nextInt();
					Building b=new Building(width);
					buils.add(b);
					break;
				case 2:
					if(!buils.isEmpty()){
						Building.displayAll(buils);
					}
					break;	
				default:
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
	}
}
