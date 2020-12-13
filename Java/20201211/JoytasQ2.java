import java.util.*;
public class JoytasQ2{
	public static void main(String[] args){
		Map<Integer,Integer> map=new LinkedHashMap<>();
		for(int i=1;i<=6;i++){
			map.put(i,0);
		}
		Scanner sc=new Scanner(System.in);
		System.out.print("サイコロを何回ふりますか>");
		int count=sc.nextInt();
		Random rand=new Random();
		for(int i=0;i<count;i++){
			int num=rand.nextInt(6)+1;
			map.put(num,map.get(num)+1);
		}
		System.out.println("***result***");
		for(int key:map.keySet()){
			System.out.printf("%d...%d回%n",key,map.get(key));
		}

		/*
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);
		Map<Integer,Integer> map=new LinkedHashMap<>();
		System.out.print("サイコロを何回振りますか？>");
		int diceNum=sc.nextInt();

		for(int i=0;i<diceNum;i++){
			int dice=rand.nextInt(6)+1;
			diceMap.put((i+1),dice);
		}
		System.out.println("***result***");
		for(int i=0;i<diceMap.size();i++){
			if(diceMap.containsValue(key)){
				count++;
			}

			}
		}
		*/
	}
}
