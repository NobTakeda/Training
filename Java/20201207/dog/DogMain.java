import java.util.*;
public class DogMain{
	public static void main(String[] args){
		Dog d1=new Dog("Jhon");
		System.out.println(d1.getName());
		Dog d2=new Dog("Paul",2);
		d2.setWeight(4000d);
		System.out.printf("お名前%s,年齢%d歳の体重は%.1fです%n",d2.getName(),d2.getAge(),d2.getWeight());
		Dog d3=new Dog("George",3,7000d);
		d3.agePlus();

		Dog[] dogs={d1,d2,d3};
		for(Dog d:dogs){
			d.bow();
			System.out.println("idは"+d.getId());
		}
		Dog d4=new Dog("Ben");
		d4.setAge(8);
		d4.setWeight(13000d);
		System.out.printf(d4.getId()+"番のお名前%s,年齢%d歳の体重は%.1fです%n",d4.getName(),d4.getAge(),d4.getWeight());
		/*
		for(int i=0;i<dogs.length;i++){
			dogs[i].bow();
		}
		*/
	}
}
