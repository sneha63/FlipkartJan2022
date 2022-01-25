package cucumbermap;

import java.net.UnknownHostException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utility.HTMLReportGenerator;

public class Hookable 
{
	@Before
	public void before(Scenario scenario) throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("E:\\eveningbatch\\flipkart.html", "Flipkart");
		HTMLReportGenerator.TestCaseStart(scenario.getName(),scenario.getId());
		
		System.out.println("------------------Scenario start-----------------------");
		
	}
	
	
	@After
	public void after(Scenario scenario)
	{
		
		System.out.println("------------------Scenario end-----------------------");
		
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
		
	}

	
	
	
	
}
