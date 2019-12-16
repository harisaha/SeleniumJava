package week3.classroom;

public class MyMobile {
public static void main(String[] args) {
	Redmi myRedmi = new Redmi();
	Samsung mySam = new Samsung();
	myRedmi.getBrand();
	mySam.getBrand();
	myRedmi.getRedmi();
	mySam.getSamsung();
	System.out.println(myRedmi.getOperatingSystem("Android"));
	System.out.println(mySam.getColor());
	
}
}
