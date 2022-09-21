Feature: Account Functionality

  Scenario:Account Create
    Given Navigate to Luma Website
    And Click to Create Account Menu button
      | createAccountMenuBtn |
    And Fill in the First Name, Last Name, Email, Password, Confirm Password inputs
      | firstName       | Techno             |
      | lastName        | Study              |
      | email           | techno33@gmail.com |
      | password        | Techno123          |
      | passwordConfirm | Techno123          |
    When Click to Create Account button
      | createAccountBtn |
    When Successfully message should be displayed
    And Click to sign out button
      | dropdownBtn |
      | signOutBtn  |

