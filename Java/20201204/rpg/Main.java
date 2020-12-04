public class Main{
	public static void main(String[] args){
		/*
		//SuperHero sh=new SuperHero();
		//h.run();
		//sh.run();
		//Weapon w=new Weapon();
		Hero h=new Hero();
		Sword sword=new Sword();
		sword.name="はがねの剣";
		sword.damage=10;
		h.setSword(sword);
		//PoisonMatango pm=new PoisonMatango('A');
		//pm.attack(h);
		Matango[] ms=new PoisonMatango[3];
		ms[0]=new PoisonMatango('A');
		ms[1]=new PoisonMatango('B');
		ms[2]=new PoisonMatango('C');
		
		for(Matango m : ms){
			m.attack(h);
			System.out.println(h.name+"のHP"+h.hp);
		}
		//System.out.println(h.name+"のHP"+h.hp);
		h.attack(ms[0]);
		*/
		//Character c=new Character();
		Dancer dancer=new Dancer();
		Goblin gob=new Goblin();
		Werewolf dog=new Werewolf();
		DeathBat bat=new DeathBat();

		gob.attack();
		gob.run();
		dog.attack();
		dog.run();
		bat.attack();
		bat.run();

	}
}
