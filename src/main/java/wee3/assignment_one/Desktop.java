package wee3.assignment_one;

public class Desktop implements Hardware,Software {
	String model = "HP Model-2013";
	@Override
	public void softwareResources() {
		System.out.println("This is a software.");
		
	}

	@Override
	public String hardwareResources() {
		return "This is a hardware";
		
	}
	public String desktopModel() {
		return model;
	}
	public static void main(String[] args) {
		Hardware hard = new Desktop();
		Software soft = new Desktop();
		System.out.println(((Desktop)hard).desktopModel());
		System.out.println(hard.hardwareResources());
		soft.softwareResources();
	}
}
