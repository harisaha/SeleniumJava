package day1.classroom;

public class Mobile {
	
	public long makeCall() {
		System.out.println("Calling");
		return 9865816101l;
	}
	public String sendSMS() {
		System.out.println("Message is sending");
		return "message sent";
	}
	public void shutDown() {
		System.out.println("Shutdown is done");
	}
	
		

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile mob = new Mobile();
		long Number = mob.makeCall();
		System.out.println(Number);
		mob.sendSMS();
		mob.shutDown();

	}

}
