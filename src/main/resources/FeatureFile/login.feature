Feature:Login Functionality

  Scenario:Login process with valid information
    Given Navigate to Luma Website
    And Click to sign in menu button
    And Fill in the email input as "techno33@gmail.com"
    And Fill in the password input as "Techno123"
    When Click to sign in button
    Then Verify that you are logged in




