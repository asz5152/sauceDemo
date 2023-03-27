Feature: Sauce Demo Test Cases


  @SauceDemo
  Scenario: Verify user is able to login successfully
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

