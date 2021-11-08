@tag
Feature: Login to the Saucedemo page and make a purchase of the selected products
  As a user
  I want to be able to make a purchase successfully

  @MakePurchase
  Scenario Outline: Make a purchase of the selected products
    Given that the user is logged into the Saucedemo page
  #  When selects the products and adds them to the shopping cart
  #  And made the purchase successfully
  #  Then the user should see the message Your order has been dispatched, and will arrive just as fast as the pony can get there!


    Examples:
      | id | information |
      | 1  | F1EUR       |






