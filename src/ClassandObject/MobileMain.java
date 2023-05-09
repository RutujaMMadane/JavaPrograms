package ClassandObject;

public class MobileMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile samsung=new Mobile();
		samsung.ram=4;
		samsung.rom=8;
		samsung.color="black";
		samsung.os="andriod";
		System.out.println("samsung.ram="+samsung.ram);
		System.out.println("samsung.rom="+samsung.rom);
		System.out.println("samsung.color="+samsung.color);
		System.out.println("samsung.os="+samsung.os);
		samsung.communication();
		samsung.Gaming();
		samsung.Browsing();

		
		Mobile honor=new Mobile();
		honor.ram=8;
		honor.rom=64;
		honor.color="white";
		honor.os="andriod";
		System.out.println("honor.ram="+honor.ram);
		System.out.println("honor.rom="+honor.rom);
		System.out.println("honor.color="+honor.color);
		System.out.println("honor.os="+honor.os);
		honor.communication();
		honor.Gaming();
		honor.Browsing();
	}

}
