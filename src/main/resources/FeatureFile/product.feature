Feature: Product Functionality

  Scenario: Product
    Given Navigate to Luma Website
    And Click to sign in menu button
    And Fill in the email input as "techno1@gmail.com"
    And Fill in the password input as "Techno123"
    When Click to sign in button
    And Click to Men Menu button
    And Click to jackets button
    And Click to random product
    And Click to random size
    And Click to random color
    And Click to Add To Cart button
    And Click to shopping Cart
    And Click to proceed to Checkout button
    And Click to random shipping method
    And Click to next button
    When Click to  place order button
    Then Prchase message should be displayed

