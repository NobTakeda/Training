import java.util.*;
public class JoytasQ2_2ans{
	public static void main(String[] args){
		Map <Integer,Integer> map=new TreeMap<>();
		Random rand=new Random();
		for(int i=0;i<100;i++){
			int num=rand.nextInt(100)+1;
			if(map.containsKey(num)){
				map.put(num,map.get(num)+1);
			}else{
				map.put(num,1);
			}
		}
		System.out.println("***result***");
		System.out.println(map.size()+"種類の数値が出ました");
		for(int key:map.keySet()){
			System.out.printf("%d...%d%n",key,map.get(key));
		}
	}
}
