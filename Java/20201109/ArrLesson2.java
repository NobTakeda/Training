public class ArrLesson2{
	public static void main(String[] args){
		int[] data=new int[5];

		System.out.println(data[0]);
		System.out.println(data.length);
		data[0]=100;
		data[data.length-1]=150;//最後の要素
		data[2]=120;
		data[1]=data[2]-data[0];
		System.out.println(data[1]);
	}
}
