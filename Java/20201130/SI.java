import java.util.*;
public class SI{
	public static void main(String[] args){
		String[] params={"体力","魔力","パワー","きようさ","すばやさ"};
		String[] races={"人間","ハイエルフ","トロル","ノーム"};
		String[] classes={"戦士","盗賊","僧侶","魔術師"};
		int[][] raceMatrix={
			{10,10,10,10,10},
			{0,20,0,10,20},
			{30,0,20,0,0},
			{10,0,0,25,20},
		};
		double[][] classMatrix={
			{1.6,1,1.4,1,1},
			{1.1,1,1.2,1.3,1.3},
			{1.3,1.5,1.1,1,1},
			{1,1.9,1,1,1.1},
		};

		Scanner sc=new Scanner(System.in);
		System.out.print("名前を入力してください>");
		String name=sc.nextLine();
		int seed=calcSeed(name);
		int[] status=makeStatus(seed,new int[]{100,100,50,50,50});
		System.out.println("初期ステータスが決定しました");
		showStatus(status,params);
		System.out.print("種族を選んでください 0...人間,1...ハイエルフ,2...トロル,3...ノーム>");
		int race=sc.nextInt();
		System.out.println(races[race]+"のボーナスが適用されました！");
		raceBonus(status,raceMatrix[race]);
		showStatus(status,params);
		System.out.print("職業を選んでください 0...戦士,1...盗賊,2...僧侶,3...魔術師>");
		int cls=sc.nextInt();
		System.out.println(classes[cls]+"のボーナスが適用されました!");
		classBonus(status,classMatrix[cls]);
		showStatus(status,params);
		System.out.println("***作成成功！***");
		System.out.printf("私は%sの%s,%sです。%n",races[race],classes[cls],name);
		System.out.println("能力値("+sumStatus(status)+"を高い順に並べると)");
		sortStatus(status,params);
		for(int i=0;i<status.length;i++){
			System.out.printf("%s:%d%n",params[i],status[i]);
		}
		System.out.println("です。今後ともよろしく...。");
	}
	static int calcSeed(String name){
		int seed=0;
		for(int i=0;i<name.length();i++){
			seed+=name.charAt(i);
		}
		return seed;
	}
	static int[] makeStatus(int seed,int[] maxArr){
		int[] vals=new int[maxArr.length];
		Random rand=new Random(seed);
		for(int i=0;i<vals.length;i++){
			vals[i]=rand.nextInt(maxArr[i])+1;
		}
		return vals;
	}
	static void raceBonus(int[] status,int[] bonus){
		for(int i=0;i<status.length;i++){
			status[i]+=bonus[i];
		}
	}
	static void classBonus(int[] status,double[] ratio){
		for(int i=0;i<status.length;i++){
			status[i]=(int)(status[i]*ratio[i]);//intでキャストする
		}
	}
	static int sumStatus(int[] status){
		int sum=0;
		for(int n:status){
			sum+=n;
		}
		return sum;
	}
	static void sortStatus(int[] status,String[] params){
		for(int i=0;i<status.length-1;i++){
			for(int j=i+1;j<status.length;j++){
				if(status[i]<status[j]){
					int t1=status[j];
					status[i]=status[j];
					status[j]=t1;
					String t2=params[i];
					params[i]=params[j];
					params[j]=t2;
				}
			}
		}
	}
	static void showStatus(int[] status,String[] params){
		String str="";
		for(int i=0;i<status.length;i++){
			str+=params[i]+":"+status[i]+" ";
		}
		System.out.println("["+str+"]");
	}
}
