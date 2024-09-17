package StepPack;

import java.util.HashMap;

import BasePack.BaseClass;
import PomPack.LoginPom;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepClass extends BaseClass {

	LoginPom ps=new LoginPom();
	
	HashMap<String, String>credintials=new HashMap<String, String>();

	@Given("User launch {string}")
	public void user_launch(String string) {

		LaunchBrowsers(string);
	}

	@When("Launch The Url")
	public void launch_the_url() {
		
		LaunchUrl("https://www.facebook.com/");
	}
	@Then("user Enter {string}")
	public void user_enter(String credintials) {
	    
		try
		{ 
			ps.enterUserName();
			ps.enterPassword();
            ps.clickLogin();

		}
			catch (Exception e) {
				
				System.out.println("Error During Login");
			}
		
	

}
}