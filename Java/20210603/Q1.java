public class Q1{
	public static void main(String[] args){
		int[][] nums=new int[9][9];
		for(int i=0;i<9;i++){
			for(int j=0;j<9;j++){
				nums[i][j]=(i+1)*(j+1);
			}
		}
		for(int i=0;i<nums.length;i++){
			for(int j=0;j<nums[i].length;j++){
				System.out.printf("%3d",nums[i][j]);
			}
			System.out.println();
		}
	}
}
