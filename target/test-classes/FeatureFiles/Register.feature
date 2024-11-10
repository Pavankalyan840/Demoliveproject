Feature: Registration functionality secnarios 

@Register @One
 Scenario: verify whether the user is able to register into the applaction by providing all th fields 
  Given I lanuch the applaction 
  And I navigate to Account Registration page 
  When I provide all the below valid details 
  | Fristname | pavan                |
  | Lastname  | Kalyan               |
  | Email     | panihoney8@gmail.com |
  | Telephone | 7660823309           |
  | Password  | 99663311             |
  And I select th Privacy Policy
  And I click on continue Button
  Then I should see that the User Account has successfuly created  