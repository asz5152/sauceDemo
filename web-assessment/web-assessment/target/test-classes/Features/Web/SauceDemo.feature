Feature: Shopping Cart Functionality
  As a user of the Sauce Demo website
  I want to be able to login, filter products, add and remove products from my cart, checkout, and logout
  So that I can purchase items I'm interested in


  @SauceDemo
  Scenario: Verify user is able to login successfully,filter products,add products to cart,
            place order and log out
    Given [Web] Launch Sauce Demo Website
    When  [Web] User enters username "standard_user"
    When  [Web] User enters password "secret_sauce"
    Then  [Web] User clicks Login button
    And   [Web] User filters products on the home page with "az"
    And   [Web] User filters products on the home page with "za"
    And   [Web] User filters products on the home page with "lohi"
    And   [Web] User filters products on the home page with "hilo"
    Then  [Web] User adds a product "red t-shirt" in cart
    Then  [Web] User adds a product "fleece t-shirt" in cart
    Then  [Web] User adds a product "bolt t-shirt" in cart
    And   [Web] User clicks on cart
    Then  [Web] User removes a product from cart
    Then  [Web] User checks out
    And   [Web] User enters checkout details
    Then  [Web] User clicks continue button
    Then  [Web] User clicks finish button
    And   [Web] Verify the order has been placed succesfully
    Then  [Web] User clicks back to home
    Then  [Web] User clicks menu button on the home page
    And   [Web] User logs out
#    Examples:
#      | user_name              |   password
#      |standard_user           |   secret_sauce
#      |locked_out_use          |   secret_sauce
#      |problem_user            |   secret_sauce
#      |performance_glitch_user |   secret_sauce

