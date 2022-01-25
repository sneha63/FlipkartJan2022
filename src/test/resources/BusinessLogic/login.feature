Feature:  Login Functionality


Background: User is successfully logged in
Given user open "Chrome" browser with exe 
Given user open url as 


@SmokeTest
Scenario Outline: Login Functionality with valid credentials
When user click on cancel button
When user move to element
When user click on My profile
When user enter username as 8261878373
When user enter password as Sneha@4567
When user click on login button
Then application shows user profile to user


         