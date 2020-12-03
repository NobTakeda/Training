import java.util.*;
public class Pool{
		final double MAX=600d;//double型なので数値にdをつけるのがグッドマナー
		double water;

		public Pool(){
			this.water=0d;//同上
		}
		public void feedWater(double water){
				/*
				 double w=Math.min(water,MAX-this.water);
				 System.out.printf("%.1f立法メートル排水しました。%n",w);
				 this.water+=w;
				 */
			double feed=MAX-this.water;
			double temp=this.water+water;
			this.water= temp >= MAX ? MAX:(this.water+water);
			System.out.println(feed+"立法メートル排水しました");
			/*
			if(temp>=MAX){
					System.out.println((MAX-this.water)+"立法メートル給水しました");
					this.water=MAX;
			}else{
					System.out.println(water+"立法メートル給水しました");
					this.water+=water;
			}
			*/
		}
		public void drainWater(double water){
				if(water<0){
						System.out.println("[排水量は正の値を入れてください]");
				}else if(this.water-water<0){
						double temp=this.water;
						this.water=0;
						System.out.println(temp+"立法メートル排水しました");
				}else{
						this.water-=water;
						System.out.println(water+"立法メートル排水しました");
				}
		}
		public void display(){
				System.out.println("現在の水量は"+this.water+"立法メートルです");
		}
}
