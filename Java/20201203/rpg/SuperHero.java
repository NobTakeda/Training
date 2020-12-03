public class SuperHero extends Hero{
		boolean flying;
		public SuperHero(){
				System.out.println("SuperHeroコンストラクタ");
		}
		public void fly(){
				this.flying=true;
				System.out.println("飛び上がった");
		}
		public void land(){
				this.flying=false;
				System.out.println("着地した");
		}
		@Override//オーバーライドの際は必ずこれを記述！
		public void run(){
				System.out.println(this.name+"は撤退した！");
		}
		@Override
		public void attack(Matango m){
				super.attack(m);//super.の記述で、親インスタンスの命令を呼び出す
				if(this.flying){
						super.attack(m);
				}
		}
}
