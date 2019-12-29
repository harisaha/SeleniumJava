package week3.classroom;

public class RemoteBrowser implements Chrome{
	public void locateElement(String locater) {
		System.out.println("Found it.");
	}
	public String getTitle() {
		return "Got it";
		
	}
	public void close() {
		System.out.println("abcd");
	}

}
