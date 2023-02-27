Feature:Application login
Scenario:Home page login
Given user is on netbanking page
When  user login into application with username and password
Then home page is populated
And cards are displayed
