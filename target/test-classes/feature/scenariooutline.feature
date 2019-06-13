Feature: To Add customer
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario
    Given user should be in telecom homepage
    Given User click the add customer
    When User should provide valid details"<fname>","<lname>","<email>","<address>","<mobile>"
    Then Customer id is generated

    Examples: 
      | fname  | lname | email         | address | mobile |
      | Ragul  | kumar | abc@gmail.com | chennai |  12345 |
      | ram    | kumar | zxc@gmail.com | mumbai  |  42536 |
      | dinesh | raj   | mkl@gmail.com | kolkata |  87654 |
