import java.util.*;
public class Building{
	int width;

	public Building(int width){
		this.width=width;
	}
	static void display(List<Building> list,int max){
		int totalWidth=0;
		for(int i=0;i<list.size();i++){
			totalWidth+=list.get(i).width;
		}
		int count=0;
		for(int k=0;k<list.size();k++){
			for(int i=0;i<max;i++){
				for(int j=0;j<list.get(count).width;j++){
					if(list.get(count).width<max){
						System.out.print(" ");
					}else{
						System.out.print("#");
					}
					count++;
				}
			}
			System.out.println();
		}
	}
	static void displayAll(List<Building> list){
		int max=list.get(0).width;
		for(int i=1;i<list.size()-1;i++){
			if(max<list.get(i).width){
				max=list.get(i).width;
			}
		}
		display(list,max);
	}
}
