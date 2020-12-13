import java.util.*;
	public class JoytasQ3{
		public static void main(String[] args){
		Random rand=new Random();	
		Map <Integer,Integer> map=new HashMap<>();
		Map <Integer,Integer> game=new TreeMap<>();
		int sum=0;
		int count=0;
		int total=0;
		for(int i=0;i<500;i++){
			int gameNum=0;
			for(int j=0;map.size()<6;j++){
				int dice=rand.nextInt(6)+1;
				if(map.containsValue(dice)){
					total++;
					continue;
				}else{
					count++;
					total++;
					map.put(count,dice);
				}
				gameNum++;
				game.put(gameNum,total);
				sum+=(total*300);
			}
		}
		System.out.println("******************結果*******************");
		int max=6;
		for(Integer key:game.keySet()){
			System.out.printf("%d(%d):",key,(300*key));
			for(int k=0;k<game.get(key);k++){
				System.out.print("*");
			}
			System.out.println();
			if(max<total){
				max=total;
			}
		}
		System.out.println("コンプ平均値:"+sum/game.size()+"円");
		System.out.printf("モード(最頻値):%d回(%d)円%n",max,max*300);
	}
}
