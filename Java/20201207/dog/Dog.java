public class Dog{

	public static int count=0;
	private int id;
	private String name;
	private int age;
	private double weight;

	public Dog(String name){//必ず通るコンストラクタに必ずしたい処理を記述
		this.setName(name);
		count++;
		this.setId(count);
	}
	public Dog(String name,int age){
		this(name);
		this.setAge(age);
	}
	public Dog(String name,int age,double weight){
		this(name,age);
		this.setWeight(weight);
	}
	public void agePlus(){
		this.age++;
		//this.setAge(this.getAge()+1);
	}
	public void bow(){
		System.out.println(this.name+"は吠えた");
	}
	public int getId(){
		return this.id;
	}
	public void setId(int id){
		this.id=id;
	}
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name=name;
	}
	public int getAge(){
		return this.age;
	}
	public double getWeight(){
		return this.weight;
	}
	public void setAge(int age){
		if(age<0){
			throw new IllegalArgumentException("年齢の値が不正です");
		}else{
			this.age=age;
		}
	}
	public void setWeight(double weight){
		if(weight<500){
			throw new IllegalArgumentException("体重の値が不正です");
		}else{
			this.weight=weight;
		}
	}
}
