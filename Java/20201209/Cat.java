import java.util.*;
public class Cat{
	char type;
	String name;
	int intimacy;

	public Cat(){
		this.intimacy=0;
	}
	public void collect(){
		int num=new Random().nextInt(3);
		if(num==0){
			this.type='A';
		}else if(num==1){
			this.type='B';
		}else{
			this.type='C';
		}
		System.out.println(this.type+"-type Cat appeared!");
		System.out.print("please Name this cat>");
		String name=new Scanner(System.in).nextLine();
		this.name=name;
		System.out.println(this.name+"Joined!!");
	}
	public void play(){
		System.out.println("Play with "+this.name);
		System.out.println("...");
		System.out.println("intimacy is UP!!");
		intimacy++;			
	}
}
