Feature: Amazon Search and Cart feature
  @wip
  Scenario: Amazon search and cart functionality
    Given User is on the Amazon Home Page
    And User search for hats for men
    And User adds thr first hat appearing to the cart with quantity two
    Then The total price and quantity should be correct
    When User reduce the quantity from two to one
    Then Total price and quantity has been changed correctly