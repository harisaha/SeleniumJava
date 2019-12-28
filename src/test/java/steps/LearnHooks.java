package steps;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class LearnHooks {
	@Before
	public void preCondition(Scenario sc) {
		System.out.println("Test Name : "+sc.getName());
		System.out.println("Line No. : "+sc.getId());
		System.out.println("Test Status : "+sc.getStatus());
	}
	@After
	public void postCondition(Scenario sc) {
		System.out.println("Test Status : "+sc.getStatus());
	}
}
