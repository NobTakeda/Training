import java.util.*;
public class Flowerbed2{
	final int MAXWATER=3;
	String color;
	int seedNum;
	int bloom;
	int water;

	public Flowerbed2(String color,int num){
		this.color=color;
		this.seedNum=num;
	}
	public void drawWater(){
		if(this.water==MAXWATER){
			System.out.println("水は満杯です！");
			return;
		}
		//}else{
			int draw=MAXWATER-this.water;
			System.out.printf("水を%d杯汲みました。%n",draw);
		this.water+=draw;
	}
	public void waterFlower(){
		if(this.bloom==this.seedNum){
			System.out.println("全ての花が咲いています！");
		}else if(this.water==0){
			System.out.println("水が空っぽです。");
		}else {
			System.out.println("水を撒きました。");
			this.water--;
			this.bloom++;
		}
	}
	public void showStatus(){
		System.out.println("花の色は"+color);
		System.out.print("#");
		for(int i=0;i<this.seedNum;i++){
			if(i<this.bloom){
				System.out.print("*");
			}else{
				System.out.print(".");
			}
		}
/*		for(int j=0;j<this.seedNum-this.bloom;j++){
			System.out.print(".");
		}*/
		System.out.println("#");
	}
}
