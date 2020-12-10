import java.util.*;
public class SetEx2{
	public static void main(String[] args){
		String[] strArray = new String[]{
			"emhjopwxaz",
			"ykxfjihxvv",
			"oqsuoeojku",
			"stvzdzdplo",
			"ftrmgkauna",
			"ackzqxlchf",
			"dqttpisosm",
			"psjhgorrem",
			"kfcrgfxenb",
			"vwappsvdld",
			"gvovlddccr",
			"ybaoyevbsl",
			"thhujdjaqk",
			"luxrfzmlyz",
			"zpewohxhvc",
			"whcddsgogv",
			"hzyjmgrbxw",
			"mjmxnxawrw",
			"hdndjktido",
			"vymqiltdzq"
		};
		Set<String> sortedStr=new TreeSet<>(Arrays.asList(strArray));
		System.out.println(sortedStr);//Arrays.toStringの効果
		List<String> list=new ArrayList<>(sortedStr);
		System.out.println(list.get(list.size()-1));

		Iterator<String> it=list.iterator();
		while(it.hasNext()){
			String s=it.next();
			if(s.startsWith("m")){
				it.remove();
			}
		}
		/*
		for(String s:list){//拡張for文では回しながら削除などができない
			if(s.startsWith("m")){
				list.remove(s);
			}
		}
		*/
		System.out.println(list);
		/*
		for(String s:strArray){
			sortedStr.add(s);
		}
		*/
		/*
		Iterator<String> it=sortedStr.iterator();
		while(it.hasNext()){
			String e=it.next();
			if(!it.hasNext()){
				System.out.println(e);	
				return;
			}
		}
		*/
	}
}
