import java.util.*;
public class Main{
	public static void main(String[] args){
		/*
		Hero h1=new Hero("山田",100);
		Wizard w1=new Wizard();
		Wand wand1=new Wand();
		wand1.setName("マグマの杖");
		wand1.setPower(30.5);
		w1.setName("ヤナック");
		w1.setHp(50);
		w1.setMp(90);
		w1.setWand(wand1);
		System.out.printf("魔術師%sのHPは%d,MPは%d,魔力%.1fの%sを装備しています。%n",
		w1.getName(),w1.getHp(),w1.getMp(),wand1.getPower(),wand1.getName());
		w1.heal(h1);
		wand1.setPower(10);
		System.out.printf("%sの魔力が弱まり、%.1fになった%n",wand1.getName(),wand1.getPower());
		w1.heal(h1);
		*/
		System.out.println("現在の所持金は"+Hero.money);//フィールドで初期値が0として初期化されている
		Hero h=new Hero("ロト");
		h.setHp(100);
		Hero h1=new Hero("ジェシカ");
		h1.setHp(100);
		h.attack();
		h1.attack();
		//System.out.println("現在の所持金は"+Hero.money);
		Hero.showMoney();
		System.out.println(h.getName()+":"+h.getHp());
		System.out.println(h1.getName()+":"+h1.getHp());
	}
}
