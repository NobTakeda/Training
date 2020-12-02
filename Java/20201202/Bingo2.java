import java.util.*;
public class Bingo2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("幅は？>");
		int width=sc.nextInt();
		//makeCardメソッドでカード用の配列作成
		int card[][]=makeCard(width);
		//for文でビンゴカード出力
		/*
		for(int[] line :card){
			System.out.println(Arrays.toString(line));
		}
		↑メソッドで表示するため割愛*/
		System.out.println("**********************");
		showCard(card);
		System.out.println("**********************");
		int[][] h=horizontalLines(card);
		showCard(h);
		System.out.println("**********************");
		int[][] v=verticalLines(card);
		showCard(v);
		System.out.println("**********************");
		int[][] c=crossLines(card);
		showCard(c);
		System.out.println("**********************");
		int bingoCount=countBingoLine(card);
		System.out.println(bingoCount);
		System.out.println("**********************");
		int[][] mergedLines=mergeThreeLines(h,v,c);
		showCard(mergedLines);
	}
	static int[][] makeCard(int width){
		Random rand=new Random();
		int[][] bingoCard=new int[width][width];
		for(int i=0;i<bingoCard.length;i++){
			for(int j=0;j<bingoCard[i].length;j++){
				int element=rand.nextInt(9)+1;
				bingoCard[i][j]=element;
			}
		}
		return bingoCard;
	}
	static void showCard(int[][] card){
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				System.out.print(" "+card[i][j]);
			}
			System.out.println();
		}
	}
	//int[]を受け取って全部等しいかを返すメソッド
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
			for(int j=0;j<card[i].length;j++){
				lines[i][j]=card[i][j];
			}
		}
		return lines;
	}
	static int[][] verticalLines(int[][] card){
		int lines[][]=new int[card.length][card[0].length];
		for(int i=0;i<card.length;i++){
			for(int j=0;j<card[i].length;j++){
				lines[i][j]=card[j][i];//これで縦の配列が作れる
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
	/*	lines=verticalLines(card);
		for(int[] line:lines){
			if(isSame(line)){
				count++;
			}
		}
		lines=crossLines(card);
		for(int[] line:lines){
			if(isSame(line)){
				count++;
			}
		}*/
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
			/*	if(i<3){
					for(int j=0;j<h[0].length;j++){
						lines[i][j]=h[i][j];
					}
				}else if(i<6){
					for(int j=0;j<h[0].length;j++){
						lines[i][j]=v[i][j];
					}
				}else{
					for(int j=0;j<h[0].length;j++){
						lines[i][j]=c[i][j];
					}
				}*/
			}
		return lines;
	}
}
