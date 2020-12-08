import java.util.*;
public class ArrayListLesson{
	public static void main(String[] args){
		ArrayList<String> names=new ArrayList<>();
		names.add("John");
		names.add("Paul");
		names.add("George");
		//names.add(new Scanner(System.in).next());

		System.out.println(names.get(0));//John
		System.out.println(names.size());//3
		for(int i=0;i<names.size();i++){
			System.out.println(names.get(i));
		}
		for(String s:names){
			System.out.println(s);
		}
		names.remove(0);
		System.out.println(names.size());//2
		names.add(0,"John");//先頭に挿入
		names.set(2,"Ringo");//指定indexを書き換え
		if(names.isEmpty()){
			System.out.println("要素はありません");
		}
		if(names.contains("Paul")){
			System.out.println("Paulを含みます");//要素が完全一致の場合のみ
		}
		System.out.println("Paulのindexは"+names.indexOf("Paul"));
		names.clear();//全削除

		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		for(int i:list){
			System.out.println(i);
		}
		List<String> list2=Arrays.asList("John","Paul");
		//これで作ると要素を一気に入れられるが、追加することができない
		for(int i:list2){
			System.out.println(i);
		}
		List<String> list3=new AarrayList<>();
		list3=new LinkedList<>();
	}
	static void method(List<String> list){}
}
