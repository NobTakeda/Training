import java.util.*;
public class PairPro{
	public static void main(String[] args){
		ArrayList<Cat> cats=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		System.out.println("***Cat Collection***");
		while(true){
			System.out.print("1.Collect 2.Play 3.End>");
			int select=sc.nextInt();sc.nextLine();
			switch(select){
				case 1:
					Cat cat=new Cat();
					cat.collect();
					System.out.println(cat);
					cats.add(cat);
					for(Cat c:cats){
						System.out.println(c);
					}
					break;
				case 2:
					if(cats.size()<1){
						System.out.println("You do not have anyone to play with.");
					}else{
						for(int i=0;i<cats.size();i++){
							System.out.printf("%d...%s[%s](%d)%n",i,cats.get(i).name,cats.get(i).type,cats.get(i).intimacy);
						}
						System.out.println("Who do you play with?>");
						select=sc.nextInt();
						cats.get(select).play();
					}
					break;
				default:
					System.out.println("GAME OVER");
					return;
			}
		}
	}
}
