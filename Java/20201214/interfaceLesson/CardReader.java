public class CardReader implements UsbConnectable{
	@Override
	public void usbConnect(){
		System.out.println("USB接続にてSDカードの読み書きができます。");
	}
}
