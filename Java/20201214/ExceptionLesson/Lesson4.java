import java.util.*;
import java.io.*;
public class Lesson4{
	public static void main(String[] args){
		try{
			showMessage();
		}catch(Exception e){
			;
		}
	}
	static void showMessage() throws Exception{
		System.out.println("表示します");
		Thread.sleep(2000);
		System.out.println("表示終了");
		/*
		System.out.println("表示します");
		try{
			Thread.sleep(2000);
		}catch(InterruptedException e){
			;
		}
		System.out.println("表示終了");
		*/
	}
}
