import java.util.*;
public class lott{
	public static void main(String[] args) throws Exception{
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		String[] fortunes=new String[10000];
		for(int i=0;i<fortunes.length;i++){
			fortunes[i]=String.format("%04d",i);
		}
		//System.out.println(Arrays.toString(fortunes));
		for(int i=0;i<fortunes.length;i++){
			int index=rand.nextInt(fortunes.length-i);
			String temp=fortunes[index];
			fortunes[index]=fortunes[fortunes.length-1-i];
			fortunes[fortunes.length-1-i]=temp;
		}
		System.out.print("何枚くじを買いますか>>");
		int num=sc.nextInt();
		String[] myLotts=new String[num];
		for(int i=0;i<num;i++){
			myLotts[i]=fortunes[i];
		}
		Arrays.sort(myLotts);
		System.out.println(Arrays.toString(myLotts));
		System.out.println("抽選開始...");
		String lucky=String.format("%4d",rand.nextInt(10000));
		for(int i=0;i<4;i++){
			Thread.sleep(1000);
			System.out.println(lucky.charAt(i));
		}
		List<List<String>> list=new ArrayList<>();
		for(int i=0;i<4;i++){
			list.add(new ArrayList<String>());
		}
		for(String n:myLotts){
			if(n.equals(lucky)){
				list.get(0).add(n);
			}else if(n.substring(1).equals(lucky.substring(1))){
				list.get(1).add(n);
			}else if(n.substring(3).equals(lucky.substring(3))){
				list.get(2).add(n);
			}else if(n.substring(3).equals(lucky.substring(3))){
				list.get(3).add(n);
			}
		}
		for(int i=0;i<4;i++){
			System.out.printf("%d等賞(%s) %s%n",i+1,
				String.format("%4s",lucky.substring(i)).replace(" ","*"),
				list.get(i)
			);
		}
	}
}
