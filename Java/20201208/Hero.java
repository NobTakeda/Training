public class Hero extends Object{
	String name;
	int hp;

	@Override
	public String toString(){
		return "名前:"+this.name+"/HP:"+this.hp;
	}
	@Override//本来はequalsメソッドのオーバーライド時は単体ではできない。
	public boolean equals(Object o){//ここは元のObjectメソッドの表記のままである
		if(this == o){return true;}//等値（同じアドレス）かを判定
		if(o instanceof Hero){//ここで突っ込んだObjectクラスのoがHeroクラスであるか判定
			Hero h=(Hero)o;//ObjectクラスのoをHeroクラスのoにダウンキャストする
			if(this.name.equals(h.name)){//文字列（名前）が同じか判定
				return true;
			}
		}
		return false;
	}
}
