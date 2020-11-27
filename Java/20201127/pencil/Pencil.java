import java.util.*;
public class Pencil{
	String color;
	int penLength;

	public Pencil(String color){
		this.color=color;
		this.penLength=5;
	}
	public void pencilInfo(){
		System.out.println(this.color);
		for(int i=0;i<this.penLength;i++){
			System.out.print("+");
		}
		System.out.println(">");
	}
	public void drawPencil(){
		if(this.penLength==0){
			System.out.println("書けません！");
		}else{
			System.out.println(this.color+"で書いた！");
			this.penLength--;
		}
	}
}
