Feature: To Add customer
  I want to use this template for my feature file

  Scenario: Title of your scenario
    Given user should be in telecom homepage
    Given User click the add customer
    When User should provide valid details
      | fname   | ashok         |
      | lname   | kumar         |
      | mail    | iop@gmail.com |
      | address | trichy        |
      | phone   |     987654321 |
    Then Customer id is generated
