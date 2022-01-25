package cucumbermap;


import java.util.Hashtable;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import utility.HTMLReportGenerator;
import utility.SeleniumOperations1;

public class Login
{
	@Given("user open {string} browser with exe")
	public void user_open_browser_with_exe(String string)
	{
		 Object[] input=new Object[1];
		 input[0]="Chrome";
		
		SeleniumOperations1.browserLaunch(input);
		
	}

	@Given("user open url as")
	public void user_open_url_as() 
	{
	
        SeleniumOperations1.openApplication();
      
	}

	@When("user click on cancel button")
	public void user_click_on_cancel_button()
	{
		Object[] input2=new Object[1];
        input2[0]="//*[@class='_2KpZ6l _2doB4z']";
        
        Hashtable<String, Object> output2=SeleniumOperations1.clickonElement(input2);
        HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"user click on cancel button", output2.get("MESSAGE").toString());
	}

	@When("user move to element")
	public void user_move_to_element() 
	{
		Object[] input3=new Object[1];
        input3[0]="//*[@class='_28p97w']";
        
        Hashtable<String, Object> output3=SeleniumOperations1.moveOnElement(input3);
        HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"user move to element", output3.get("MESSAGE").toString());
	}

	@When("user click on My profile")
	public void user_click_on_my_profile() 
	{
		Object[] input4=new Object[1];
        input4[0]="//*[text()='My Profile']";
        
        Hashtable<String, Object> output4=SeleniumOperations1.clickonElement(input4);
        HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"user click on My profile", output4.get("MESSAGE").toString());
	}

	@When("user enter username as {string}")
	public void user_enter_username_as(String string)
	{
		Object[] input5=new Object[2];
        input5[0]="//*[@class='_2IX_2- VJZDxU']";
        input5[1]=string;
        
        Hashtable<String, Object> output5=SeleniumOperations1.EnterSendkey(input5);
        HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"user enter username as {string}", output5.get("MESSAGE").toString());
	}

	@When("user enter password as {string}")
	public void user_enter_password_as(String string) 
	{
		Object[] input6=new Object[2];
        input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
        input6[1]=string;
        
        Hashtable<String, Object> output6=SeleniumOperations1.EnterSendkey(input6);
        HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"user enter password as {string}", output6.get("MESSAGE").toString());
	}

	@When("user click on login button")
	public void user_click_on_login_button() 
	{
		Object[] input7=new Object[1];
        input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
        
        Hashtable<String, Object> output7=SeleniumOperations1.clickonElement(input7);
        HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"user click on login button", output7.get("MESSAGE").toString());
    }

	@Then("application shows user profile to user")
	public void application_shows_user_profile_to_user() 
	{
		Object[] input8=new Object[2];
		input8[0]="Personal Information";
        input8[1]="//*[text()='Personal Information']";
       
        Hashtable<String, Object> output8=SeleniumOperations1.validationLogin(input8);
        HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"application shows user profile to user", output8.get("MESSAGE").toString());
	}

}
