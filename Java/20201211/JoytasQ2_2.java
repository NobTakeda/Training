import java.util.*;
public class JoytasQ2_2{
	public static void main(String[] args){
		Map<Integer,Integer> map=new HashMap<>();
		Random rand=new Random();
		Scanner sc=new Scanner(System.in);

		for(int i=1;i<=100;i++){
			map.put(i,0);
		}
		for(int i=0;i<100;i++){
			int num=rand.nextInt(100)+1;
			map.put(num,map.get(num)+1);
		}
		for(int i=0;i<100;i++){
			if(map.get(i+1)==0){
			map.remove(i+1);
			}
		}
		System.out.println("***result***");
		System.out.println(map.size()+"種類の数値が出ました");
		for(Integer key:map.keySet()){
	/*		if(map.get(key)==0){
				continue;
			}else{
			}
			*/
			System.out.printf("%d...%d回%n",key,map.get(key));
		}
	}
}
