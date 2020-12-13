import java.util.*;
public class ExceptionTest{
	public static void main(String[] args)/*throws Exception*/{
		System.out.println("Start");
		try{
			Thread.sleep(3000);
		}catch(InterruptedException e){
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
}
