import java.util.*;
public class PCApp2{
	public static void main(String[] args){
		PC pc=new PC();
		List<App> appList=new ArrayList<>();
		pc.addAppli(new Excel("エクセル"));
		pc.addAppli(new Word("ワード"));
		pc.addAppli(new PowerPoint("パワポ"));
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
					pc.selectApp();
					break;
				case 1:
					System.out.print("どのアプリを実行しますか0.エクセル、1.ワード、2.パワポ>");
					int index=sc.nextInt();
					App app=appList.get(index);
					pc.setApp(app);
					pc.execApp();
					break;
				case 2:
					System.out.print("どのデバイスを接続しますか？0.マウス、1.メモリー、2.カードリーダー>");
					index=sc.nextInt();
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
