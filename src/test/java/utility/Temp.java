package utility;



public class Temp
{
	public static void main(String[]args)
	{
		//BrowserLaunch
		
		Object [] input=new Object[2];
		  input[0]="Chrome";
		   input[1]= "E:\\AutomationSupport\\chromedriver.exe";
		   SeleniumOperations1.browserLaunch(input);
		
		     
		      //OpenApplication 
		        Object[] input1=new Object[1];
		          input1[0]="https://www.flipkart.com/";
		          SeleniumOperations1.openApplication();
		
		        //ClickonCancel
		          Object[] input2=new Object[1];
		            input2[0]="//*[@class='_2KpZ6l _2doB4z']";
		            SeleniumOperations1.clickonElement(input2);
		
		           //moveToElement
		             Object[] input3=new Object[1];
		               input3[0]="//*[@class='_28p97w']";
		               SeleniumOperations1.moveOnElement(input3);
		
		               //Click on MyProfile
				          Object[] input4=new Object[1];
				            input4[0]="//*[text()='My Profile']";
				            SeleniumOperations1.clickonElement(input4);
				              
				              //Enter UserName
					            Object[] input5=new Object[2];
					             input5[0]="//*[@class='_2IX_2- _2LYh3d VJZDxU']";
					             input5[1]="8261878373";
					             SeleniumOperations1.EnterSendkey(input5);
				
				        
					
					            //Enter Pass
						          Object[] input6=new Object[2];
						            input6[0]="//*[@class='_2IX_2- _3mctLh VJZDxU']";
						            input6[1]="Sneha@4567";
						            SeleniumOperations1.EnterSendkey(input6);
						              
						            //ClickonLogin
							          Object[] input7=new Object[1];
							            input7[0]="//*[@class='_2KpZ6l _2HKlqd _3AWRsL']";
							            SeleniumOperations1.clickonElement(input7);
							            
							            //login validation 
							            Object[] input8=new Object[2];
							    		input8[0]="Personal Information";
							            input8[1]="//*[text()='Personal Information']";
							            SeleniumOperations1.validationLogin(input8);
	}
	

}


