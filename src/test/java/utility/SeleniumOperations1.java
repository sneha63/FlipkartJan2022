package utility;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import cucumbermap.ConfigReader;


	public class SeleniumOperations1 
	{
		public static WebDriver driver=null;
		public static ConfigReader config=null;
		
		public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
		
		//browserLaunch Method
		public static Hashtable<String,Object> browserLaunch(Object[]inputParameters)
		{
			try{
			String BrowserName=(String) inputParameters[0];
			
			
		    config=new ConfigReader();
			
			if(BrowserName.equalsIgnoreCase("Chrome"))
			{
				System.setProperty("webdriver.chrome.driver", config.getDriverPathChrome());
				driver=new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
			}
			
			else  if(BrowserName.equalsIgnoreCase("Firefox"))
			{
				System.setProperty("webdriver.gecko.driver", config.getDriverPathFF());
				driver=new FirefoxDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
			}
			
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:browserLaunch, Input_Data : " + inputParameters[0].toString());
			
			}catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "methodUsed:browserLaunch, Input_Data : " + inputParameters[0].toString());
			}
			
			return outputParameters;
		}
		
		
		//OpenApp Method
		public static Hashtable<String,Object> openApplication()
		{
			try {
			
			driver.get(config.getApplicationUrl());
			driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
			
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "methodUsed:openApplication, Input_Data : " + config.getApplicationUrl().toString());
			
			}catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "methodUsed:openApplication, Input_Data : " + config.getApplicationUrl().toString());
			}
			
			return outputParameters;
		}
		
		  
		    //Sendkeys Method
			public static Hashtable<String,Object> EnterSendkey(Object[]inputParameters)
			{
				try {
				String value1=(String) inputParameters[0];
				String value2=(String) inputParameters[1];
				driver.findElement(By.xpath(value1)).sendKeys(value2);
				driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
				
				outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "methodUsed:EnterSendkey, Input_Data : " + inputParameters[1].toString());
				
				
				}
				catch(Exception e)
				{
					outputParameters.put("STATUS", "FAIL");
					outputParameters.put("MESSAGE", "methodUsed:EnterSendkey, Input_Data : " + inputParameters[1].toString());
				}
				
				return outputParameters;
			}
			
			
			//ClickonElement Method
			public static Hashtable<String,Object> clickonElement(Object[]inputParameters)
			{
				try {
				String xpath=(String) inputParameters[0];
				driver.findElement(By.xpath(xpath)).click();
				driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
				
				outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "methodUsed:clickonElement, Input_Data : " + inputParameters[0].toString());
				
				
				}
				catch(Exception e)
				{
					outputParameters.put("STATUS", "FAIL");
					outputParameters.put("MESSAGE", "methodUsed:clickonElement, Input_Data : " + inputParameters[0].toString());
				}
				
				return outputParameters;
			}
			
			
			//moveOnElement
	        public static Hashtable<String,Object> moveOnElement(Object[]inputParameters)
	         {
	        	try {
		      String xpath=(String) inputParameters[0];
		      Actions act=new Actions(driver);
		
		        WebElement element=driver.findElement(By.xpath(xpath));
		        act.moveToElement(element).build().perform();
		        
		        driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
		        
		        outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "moveOnElement, Input_Data : " + inputParameters[0].toString());
	         
	        	}catch(Exception e)
	        	{
	        	
	        	outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "moveOnElement, Input_Data : " + inputParameters[0].toString());
	        	
	            }
	        return outputParameters;
	        
	          }
			
			
			
			//GetText Method
			public static Hashtable<String,Object> validationLogin(Object[]inputParameters)
			{
				try {
					
				
				String givenText=(String) inputParameters[0];           //Personal Information text
				String xpath=(String) inputParameters[1];               //xpath of above text
				
				String text=driver.findElement(By.xpath(xpath)).getText();
				
				driver.manage().timeouts().implicitlyWait(config.getImplicitlyWait(), TimeUnit.SECONDS);
				
				if(givenText.equalsIgnoreCase(text))
				{
					System.out.println("Test Case Pass");
				}
					
				else
				{
					System.out.println("Test Case failed");
				}
				
				outputParameters.put("STATUS", "PASS");
				outputParameters.put("MESSAGE", "methodUsed:validationLogin, Input_Data : " + inputParameters[1].toString());
				
				}
				catch(Exception e)
				{
					outputParameters.put("STATUS", "FAIL");
					outputParameters.put("MESSAGE", "methodUsed:validationLogin, Input_Data : " + inputParameters[1].toString());
				}
				
				return outputParameters;
				
		}

		
		
	} 


