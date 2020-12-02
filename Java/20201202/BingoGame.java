import java.util.*;
public class BingoGame{
	public static void main(String[] args){
		Random rand=new Random();
		int[][] card=makeCard();
		showCard(card);
		while(true){
			System.out.println("[Enter]")
			int pickBall=rand.nextInt(99)+1;

		}
	}
	}
	static int[] makeBalls(){
		int[] balls=new int[99];
		for(int i=0;i<balls.length;i++){
			balls[i]=i+1;
		}
	}
	static int[][] makeCard(){
		int[][] card=new int[5][5];
		Random rand=new Random();
		int[] nums=new int[99];
		for(int i=0;i<nums.length;i++){
			nums[i]=i+1;
		}
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				int index=rand.nextInt(99);
				int temp=nums[index];
				card[i][j]=nums[index];
				nums[index]=nums[nums.length-1-(i*5+j)];
				nums[nums.length-1-(i*5+j)]=temp;
			}
		}
		card[2][2]=0;
		return card;
	}
	static void showCard(int[][] card){
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				if(card[i][j]==0){
					System.out.printf("%3s","@@");
				}else{
					System.out.printf("%3d",card[i][j]);
				}
			}
			System.out.println();
		}
	}
	static boolean isSame(int[] line){
		boolean isSame=true;
		int first=line[0];
		for(int i=1;i<line.length;i++){
			if(first!=line[i]){
				isSame=false;
				break;
			}
		}
	return isSame;
	}
	static int[][] horizontalLines(int[][] card){
		int lines[][]=new int[card.length][card[0].length];
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card.length;j++){
				lines[i][j]=card[i][j];
			}
		}
		return lines;
	}
	static int[][] verticalLines(int[][] card){
		int lines[][]=new int[card.length][card[0].length];
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				lines[i][j]=card[j][i];
			}
		}
		return lines;
	}
	static int[][] crossLines(int[][] card){
		int[][] lines=new int[2][card.length];
		for(int i=0;i<lines.length;i++){
			for(int j=0;j<card.length;j++){
				if(i==0){
					lines[i][j]=card[j][j];
				}else{
					lines[i][j]=card[j][card.length-1-j];
				}
			}
		}
		return lines;
	}
	static int countBingoLine(int[][] card){
		int count=0;
		int[][] h=horizontalLines(card);
		int[][] v=verticalLines(card);
		int[][] c=crossLines(card);
		int[][] lines=mergeThreeLines(h,v,c);
		for(int[] line:lines){
			if(isSame(line)){
				count++;
			}
		}
		return count;
}
  static int[][] mergeThreeLines(int[][] h,int[][] v,int[][] c){
     int[][] lines=new int[h.length+v.length+c.length][h[0].length];
       for(int i=0;i<lines.length;i++){
         int[] line;
         if(i<h.length){
           line=h[i];
         }else if(i<h.length+v.length){
           line=v[i-h.length];
         }else{
           line=c[i-h.length-v.length];
         }
       lines[i]=line;
			 }
		return lines;
	}
}
