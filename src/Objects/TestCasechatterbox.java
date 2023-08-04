package Objects;

public class TestCasechatterbox {

	public static void main(String[] args) {
		TestCase TC1 = new TestCase();
		TC1.Scenario = "login";
		TC1.Priority = "High";
		TC1.Description = "To Verify Login Page";
		TC1.Prerequisite = "Login page is open";
		
		TestCase TC2 = new TestCase();
		TC2.Scenario = "Recruiter platform";
		TC2.Priority = "medium";
		TC2.Description = "To Verify fields with valid information";
		TC2.Prerequisite = "Home page is open";
		
		TC1.execution("pass");
		TC2.execution("Fail");
		
		

	}

}
