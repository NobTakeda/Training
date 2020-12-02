import java.util.*;
public class CopyMachine{
	int paper;

	public CopyMachine(int sheet){
		if(sheet<0){
			sheet=0;
		}
		this.paper=sheet;
		//this.paper=sheet>0 ? sheet:0;
	}
	public void feedPaper(int sheet){
		System.out.println(sheet+"枚給紙しました。");
		this.paper+=sheet;
	}
	public void copy(int sheet){
		if(this.paper==0){
			System.out.println("紙がありません！");
		}/*else if(this.paper<sheet){
			System.out.println(this.paper+"枚コピーしました。");
			this.paper=0;
		}else{
			System.out.println(sheet+"枚コピーしました。");
			this.paper-=sheet;
		}*/
		int num=this.paper > sheet ? sheet :this.paper;
		this.paper-=num;
		System.out.printf("コピー可能な枚数は%d枚です。",this.paper);
	}
	public void display(){
		System.out.println("コピー可能な枚数は"+this.paper+"枚です。");
	}
/*	public void copyObservation(int sheet){
		Thread.sleep(1000);
	}*/
}
