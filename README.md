# Prerequisites

- Install Java Development Kit (JDK) 8 or higher. You can download it from the Oracle website: https://www.oracle.com/java/technologies/javase-downloads.html
- Install Eclipse IDE or IntelliJ IDEA for Java Developers. You can download it from the Eclipse website: https://www.eclipse.org/downloads/packages/


# Steps

- Open IDE.
- Open Terminal
- Enter git clone https://github.com/asz5152/sauceDemo.git
- Reload Maven
- Go to src/test/java/WebRunner.java
- Click Run

The test should start running and the results will be displayed in the console.

# Description

This is a feature file written in Gherkin language to describe the Shopping Cart functionality of the Sauce Demo website.

The feature includes three scenarios: "Add and remove items from cart", "Checkout", and "Logout".

In the background, it is assumed that the user is already on the Sauce Demo website.

The scenario describes the steps to log in as a "standard_user" with the password "secret_sauce", filter products by price, add the products to the cart, remove one of the products from the cart.Proceed to checkout, enter personal and payment details, and verify that the order is confirmed and the user is redirected to the confirmation page then click on the logout button, and verify that the user is redirected to the login page.

Note: Please let me know incase of any issues.