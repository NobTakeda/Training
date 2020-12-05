public class Pig extends Animal{
	public Pig(String name){
		super(name);
	}
	@Override
	public void makeNoize(){
		System.out.println(this.name+"は鳴いた。ブーブー");
	}
}
