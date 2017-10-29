Feature: To  create an account on the Mendeley site

  Scenario Outline: To successfully create an account
  Given I am on Mendeley homepage
  When I click on Create account link
  And I enter the "<EmailID>" , "<FirstName>" , "<LastName>" , "<Password>" and click on Continue
  And I select "<Option1>" and "<Option2>" and click on Submit
  Then verify account is created successfully and "<FirstName>" appears on homepage

  Examples:
    |      EmailID    | FirstName | LastName | Password    | Option1 | Option2   |
    | Test12233@test.com | Test      | Account  | Password123 | Design  | Other |