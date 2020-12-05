public class ElectricBicycle extends Bicycle{
	final int MAX=10;
	int battery;

	public ElectricBicycle(){
		this.wheelSize=24;
		this.battery=10;
	}
	@Override
	public void ride(){
		System.out.println("風を切って走ります");
		if(battery==0){
			System.out.println("バッテリーが切れるととても重いです。");
		}else if(battery>=5){
			System.out.println("バッテリーが切れるととても重いです。");
			battery-=5;
		}else{
			System.out.println("坂道だってラクラクです。");
			battery-=5;
		}
	}
	public void batteryCharge(){
		System.out.println("バッテリーを充電しました。");
		battery=MAX;
	}
}
