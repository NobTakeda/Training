import java.util.*;
public class DiceCompGame{
	public static void main(String[] args){
				//<何回でコンプしたか,それが何回あったか>を管理するMap
		//TreeMapを使うことでKeyを昇順にしてくる。
		Map<Integer,Integer> map=new TreeMap<>();
		//実行例をみると1回から~発生した最大回数まで出力しているのでその最大回数を調べる変数
		int maxThrowCount=0;
		for(int i=0;i<500;i++){
			//1回ごとのコンプ回数
			int diceThrowCount=diceCompCount();
			if(diceThrowCount>maxThrowCount){
				//もし、最大回数が更新されたらmaxThrowCountを更新していく
				maxThrowCount=diceThrowCount;
			}
			//Mapに登録するときの回数用の変数
			int count;
			if(map.containsKey(diceThrowCount)){
				//再登場ならばcountは今までの合計値+1
				count=map.get(diceThrowCount)+1;
			}else{
				//初登場ならばcountは1
				count=1;
			}
			//マップに登録(or 更新)
			map.put(diceThrowCount,count);
		}
		System.out.println("***************************結果*****************************");
		for(int i=1;i<=maxThrowCount;i++){
			//マップに含まれているときだけ*を出力する
			System.out.printf("%d(%d):%s%n",i,300*i,map.containsKey(i) ? createStar(map.get(i)):"");
		}
	}
	static int diceCompCount(){
		Random rand=new Random();
		Set<Integer> set=new HashSet<>();
		int count=0;
		while(set.size()<6){
			count++;
			int dice=rand.nextInt(6);
			set.add(dice);
		}
		return count;
	}
	static String createStar(int count){
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<count;i++){
			sb.append("*");
		}
		return sb.toString();
	}
}
