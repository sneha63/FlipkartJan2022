Feature:  Manage Address Functionality


Background: User is successfully logged in
Given user open "Chrome" browser with exe 
Given user open url as 
Given user click on cancel button
Given user move to element
Given user click on My profile
Given user enter username as "8261878373"
Given user enter password as "Sneha@4567"
Given user click on login button

@SmokeTest
Scenario: Manage Addresses functionality with valis data
When user click on Manage address
When user click on Add a new address
When user enter "Sneha" as Name
When user enter "8261878373" as Mobile number
When user enter "411024" Pincode
When user enter "Nanded city" as Locality
When user enter "Pune" as Address
When user select Home as Address type
When user click on Save button
Then application shows New address added successfully
 