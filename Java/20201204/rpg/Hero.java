public class Hero{
		String name="ミナト";
		int hp=100;
		Sword sword;
		public Hero(){
			//	System.out.print("Heroコンストラクタ");
		}
		public void setSword(Sword sword){
			this.sword=sword;
			System.out.println(this.name+"は"+this.sword.name+"を装備した！");
		}

		public void attack(Matango m){
				System.out.println(this.name+"の攻撃!");
				m.hp-=this.sword.damage;
				System.out.println(this.sword.damage+"ポイントのダメージを与えた");
		}
		public void run(){
				System.out.println(this.name+"は逃げだした！");
		}
}
