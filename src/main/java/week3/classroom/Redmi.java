package week3.classroom;

public class Redmi extends Mobile {
	
	public void getRedmi() {
		System.out.println("Yes...! This is the one");
	}
	public String getOperatingSystem() {
		return "Android or iOS";
		
	}
	public String getOperatingSystem(String oprsys) {
		
		if(oprsys.equals("Android")) {
			return "Yup...! I found an android.";
		}
		else if(oprsys.equals("iOS")){
			return "Yup...! I found an iOS.";
		}
		return "Other than Android and iOS";
	}
}
