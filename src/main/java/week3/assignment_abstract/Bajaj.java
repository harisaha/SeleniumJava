package week3.assignment_abstract;

public class Bajaj extends Bike {

	@Override
	public void speed() {
		System.out.println("Speed is depends on engine capacity of the vehicle.");
		
	}
	
public static void main(String[] args) {
	Bajaj vehicle = new Bajaj();
	vehicle.cost();
	vehicle.speed();
}

}
