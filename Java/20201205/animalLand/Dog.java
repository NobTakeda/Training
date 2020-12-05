public class Dog extends Animal{
	public Dog(String name){
		super(name);
	}
	@Override
	public void makeNoize(){
		System.out.println(this.name+"は鳴いた。ワンワン");
	}
}
