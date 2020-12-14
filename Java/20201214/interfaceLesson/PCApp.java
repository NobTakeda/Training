import java.util.*;
public class PCApp{
	public static void main(String[] args){
		PC pc=new PC();
		List<UsbConnectable> usbList=new ArrayList<>();
		usbList.add(new Mouse());
		usbList.add(new Memory());
		usbList.add(new CardReader());
		Scanner sc=new Scanner(System.in);
		while(true){
			System.out.print("0.アプリ実行,1.USBデバイス接続,2.終わり>");
			int select=sc.nextInt();
			switch(select){
				case 0:
					pc.exexApp();
					break;
				case 1:
					System.out.print("どのデバイスを接続しますか0.マウス、1.メモリー、2.カードリーダー＞");
					int index=sc.nextInt();
					UsbConnectable usb=usbList.get(index);
					pc.setDevice(usb);
					pc.usb();
					break;
				default:
					System.out.println("アプリケーションを終了します");
					return;
			}
		}
	}
}
