package cucumbermap;

import java.util.Hashtable;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperations1;

public class ManageAddress 
{
	@When("user click on Manage address")
	public void user_click_on_manage_address() 
	{
		Object[] input=new Object[1];
        input[0]="//*[text()='Manage Addresses']";
        
        Hashtable<String, Object> output=SeleniumOperations1.clickonElement(input);
        HTMLReportGenerator.StepDetails(output.get("STATUS").toString(),"user click on Manage address", output.get("MESSAGE").toString());
	   
	}

	@When("user click on Add a new address")
	public void user_click_on_add_a_new_address()
    {
		Object[] input1=new Object[1];
        input1[0]="//*[@class='_1QhEVk']";
        
        Hashtable<String, Object> output1=SeleniumOperations1.clickonElement(input1);
        HTMLReportGenerator.StepDetails(output1.get("STATUS").toString(),"user click on Add a new address", output1.get("MESSAGE").toString());
	   
	   
	}

	@When("user enter {string} as Name")
	public void user_enter_as_name(String string) 
	{
		Object[] input2=new Object[2];
        input2[0]="(//*[@class='_1w3ZZo _2mFmU7'])[1]";
        input2[1]=string;
        
        Hashtable<String, Object> output2=SeleniumOperations1.EnterSendkey(input2);
        HTMLReportGenerator.StepDetails(output2.get("STATUS").toString(),"user enter {string} as Name", output2.get("MESSAGE").toString());
	}

	@When("user enter {string} as Mobile number")
	public void user_enter_as_mobile_number(String string) 
	{
		Object[] input3=new Object[2];
        input3[0]="(//*[@class='_1w3ZZo _2mFmU7'])[2]";
        input3[1]=string;
        
        Hashtable<String, Object> output3=SeleniumOperations1.EnterSendkey(input3);
        HTMLReportGenerator.StepDetails(output3.get("STATUS").toString(),"user enter {string} as Mobile number", output3.get("MESSAGE").toString());
	}

	@When("user enter {string} Pincode")
	public void user_enter_pincode(String string) 
	{
		Object[] input4=new Object[2];
        input4[0]="(//*[@class='_1w3ZZo _2mFmU7'])[3]";
        input4[1]=string;
        
        Hashtable<String, Object> output4=SeleniumOperations1.EnterSendkey(input4);
        HTMLReportGenerator.StepDetails(output4.get("STATUS").toString(),"user enter {string} Pincode", output4.get("MESSAGE").toString());
	}

	@When("user enter {string} as Locality")
	public void user_enter_as_locality(String string)
	{
		Object[] input5=new Object[2];
        input5[0]="(//*[@class='_1w3ZZo _2mFmU7'])[4]";
        input5[1]=string;
        
        Hashtable<String, Object> output5=SeleniumOperations1.EnterSendkey(input5);
        HTMLReportGenerator.StepDetails(output5.get("STATUS").toString(),"user enter {string} as Locality", output5.get("MESSAGE").toString());
	}

	@When("user enter {string} as Address")
	public void user_enter_as_address(String string) 
	{
		Object[] input6=new Object[2];
        input6[0]="//*[@class='_1sQQBU _1w3ZZo _1TO48q']";
        input6[1]=string;
        
        Hashtable<String, Object> output6=SeleniumOperations1.EnterSendkey(input6);
        HTMLReportGenerator.StepDetails(output6.get("STATUS").toString(),"user enter {string} as Address", output6.get("MESSAGE").toString());
	}

	@When("user select Home as Address type")
	public void user_select_home_as_address_type()
	{
		Object[] input7=new Object[1];
        input7[0]="(//*[@class='_1XFPmK'])[1]";
        
        Hashtable<String, Object> output7=SeleniumOperations1.clickonElement(input7);
        HTMLReportGenerator.StepDetails(output7.get("STATUS").toString(),"user select Home as Address type", output7.get("MESSAGE").toString());
	  
	}

	@When("user click on Save button")
	public void user_click_on_save_button()
	{
		Object[] input8=new Object[1];
        input8[0]="(//*[@class='_2KpZ6l _1JDhFS _1o0c4q _3AWRsL'])[1]";
        
        Hashtable<String, Object> output8=SeleniumOperations1.clickonElement(input8);
        HTMLReportGenerator.StepDetails(output8.get("STATUS").toString(),"user click on Save button", output8.get("MESSAGE").toString());
	}

	@Then("application shows New address added successfully")
	public void application_shows_new_address_added_successfully() 
	{
		Object[] input9=new Object[2];
		input9[0]="Sneha";
        input9[1]="(//*[text()='Sneha'])[3]";
       
        Hashtable<String, Object> output9=SeleniumOperations1.validationLogin(input9);
        HTMLReportGenerator.StepDetails(output9.get("STATUS").toString(),"application shows New address added successfully", output9.get("MESSAGE").toString());
	}

}
