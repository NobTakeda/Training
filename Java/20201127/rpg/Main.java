import java.util.*;
public class Main{
	public static void main(String[] args){
		int n=new Random().nextInt(10);
		Hero h=new Hero();
		h.name="ロト";
		h.sleep();
		System.out.println(h.hp);
		Hero h2=new Hero();
		h2.name="ジェシカ";
		h2.sleep();
		h2.hp-=10;//h2.hp=h2.hp-10;
		System.out.println(h2.hp);
		Hero h3=new Hero();
		h3.name="ククール";
		h3.hp=200;
		System.out.println(h3.name+" HP"+h3.hp);
		
		h.sit(10);
		System.out.println(h.hp);
		Matango m1=new Matango();
		m1.hp=50;
		m1.suffix='A';
		Matango m2=new Matango();
		m1.hp=48;
		m2.suffix='B';
		h2.slip();
		System.out.println(h2.hp);
		m1.run();
		m2.run();
		h3.run();
		System.out.println(h3.name+" HP"+h3.hp);

	}
}
