Feature: to perform smoke test with different inputs

Scenario: will perform test on login form 

Given will be on login page of Orangehrm demo
When  will enter <username> and <password>
And  will click on login button
Then home page will be displayed

Examples: 

|username|password|
|abcd|12345|
|ADMIN|728whsh|
|Admin|admin123|