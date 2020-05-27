Feature: Create an account
  As a user
  I want to create an account
  So i can login

  Scenario Outline: YOUR PERSONAL INFORMATION
    Given user is on "http://automationpractice.com/index.php" homepage
    When user click Sign in CTA
    And enter random email
    And click create an account CTA button
    And user select a title
    And user input "<firstName>" in first name text field
    And user input "<lastName>" in last name text field
    And user input "<password>" in password text field
    And select day from day drop down list
    And select month from month drop down list
    And select year from year drop down list
    And user input "<company>" in company text field in your address section
    And user input "<address1>" in addressone text field in your address section
    And user input "<address2>" in addresstwo text field in your address section
    And user input "<city>" in city text field in your address section
    And select statename from state drop down list
    And user input "<zipcode>" in zipcode text field in your address section
    And select country from country drop down list
    And user input "<additionalinformation>" in additional information text field in your address section
    And user input "<homephone>" in home phone text field in your address section
    And user input "<mobilephone>" in mobile phone text field in your address section
    And user input "<assignanaddress>" in assign an address alias for future reference text field in your address section
    And click register button

    Examples: 
      | firstName | lastName | password   | company | address1       | address2       | city | state  | zipcode | additionalinformation | homephone    | mobilephone | assignanaddress |
      | collins   | obasuyi  | password01 | hmrc    | address line 1 | address line 2 | kent | london |   94555 | additionalinformation | 012345678909 | 07446916925 | lorem ipsum     |
