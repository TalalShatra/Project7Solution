Feature: Address Functionality

  Scenario Outline: Add Address Process
    Given Navigate to Luma Website
    And Click to sign in menu button
    And Fill in the email input as "techno33@gmail.com"
    And Fill in the password input as "Techno123"
    When Click to sign in button
    And Click to My Account Menu button
    And Click to Manage Address button
    And Fill in the Company input as "<company>"
    And Fill in the Phone Number input as "<phone>"
    And Fill in the Street addres first input as "<address>"
    And Fill in the city input as "<city>"
    And Fill in the Zip Code input as "<zipcode>"
    And Select a state
    And Select a country
    When Click to save address button
    Then Saved message should be displayed
    And Click to address sign out button

    Examples:
      | company | phone    | address          | city    | zipcode |
      | Mersys  | 12525396 | Manhattan Street | Newyork | 12345   |
      | Campus  | 14296566 | Newyork Street   | Dallas  | 12345   |
