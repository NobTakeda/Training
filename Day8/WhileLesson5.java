public class WhileLesson5{
	public static void main(String[] args){
		final long kei=6371000000000L;
		double rope=(kei*2)*Math.PI;
		System.out.printf("Q1.地球を一周するロープの長さは%.1fmm%n",rope);
		
		rope=rope+1000;
		double kei2=(rope/Math.PI)/2;
		System.out.printf("Q2.地球との隙間は%.1fmm%n",kei2-kei);
	}
}
