Feature: Checkout functionality for registered users

  @register
  Scenario Outline: Register a user successfully
    Given User is on the ToolShop landing page
    When User clicks Sign in button
    Then The login page is displayed
    When User clicks Register your account link
    Then The Customer registration screen is displayed
    When User enters "<first_name>" and "<last_name>"
    And User enters their "<date_of_birth>"
    And User enters their "<Address>", "<post_code>", "<city>" and "<state>"
    And User selects their "<country>"
    And User enters their "<phone_no>", "<email>" and "<password>"
    When User clicks Register button
    Examples:
      | first_name | last_name | date_of_birth | Address              | post_code | city   | state      | country      | phone_no   | email            | password |
      | Justice    | League    | 22/10/2000    | 82  Skeefblom Street | 1387      | Welkom | Free State | South Africa | 0834721722 | delulu@gmail.com | Ju$t1c33 |

  @login
  Scenario Outline: Login with valid credentials
    Given User is on the ToolShop landing page
    When User clicks Sign in button
    Then The login page is displayed
    When User enters an "<email>" and "<password>"
    And User clicks the login button
    Then User is navigated to My account screen
    Examples:
      | email                 | password  |
      | justmothobi@gmail.com | EasyP@$$1 |

  @checkoutItem
  Scenario Outline: Checkout process
    Given User is on the ToolShop landing page
    When User clicks Sign in button
    Then The login page is displayed
    When User enters an "<email>" and "<password>"
    And User clicks the login button
    Then User is navigated to My account screen
    When User clicks Catergories
    And User selects Hand Tools
    Then Hand Tools screen is displayed
    When User clicks Combination Pliers
    Then User is navigated to Combination Pliers screen
    And User clicks add to cart
    Then Product added popup is displayed
    When User clicks cart
    Then User is navigated to the cart screen
    When User clicks Proceed to checkout on cart screen
    Then User is navigated to sign in screen with "<email>" and "<password>"
    When User clicks Proceed to checkout on sign in screen
    Then Billing Address screen is displayed
    When User clicks proceed to checkout on address screen
    Then Payment screen is displayed
    When User selects payment method
    And User clicks confirm button
    Then Payment was successful is displayed
    Examples:
      | email          | password  |
      | blah@gmail.com | EasyP@$$2 |

  @EndToEnd
  Scenario Outline: New customer can check out item successfully end-to-end
    Given User is on the ToolShop landing page
    When User clicks Sign in button
    Then The login page is displayed
    When User clicks Register your account link
    Then The Customer registration screen is displayed
    When User enters "<first_name>" and "<last_name>"
    And User enters their "<date_of_birth>"
    And User enters their "<Address>", "<post_code>", "<city>" and "<state>"
    And User selects their "<country>"
    And User enters their "<phone_no>", "<email>" and "<password>"
    When User clicks Register button
    Then The login page is displayed
    When User enters an "<email>" and "<password>"
    And User clicks the login button
    Then User is navigated to My account screen
    When User clicks Catergories
    And User selects Hand Tools
    Then Hand Tools screen is displayed
    When User clicks Combination Pliers
    Then User is navigated to Combination Pliers screen
    And User clicks add to cart
    Then Product added popup is displayed
    When User clicks cart
    Then User is navigated to the cart screen
    When User clicks Proceed to checkout on cart screen
    Then User is navigated to sign in screen with "<email>" and "<password>"
    When User clicks Proceed to checkout on sign in screen
    Then Billing Address screen is displayed
    When User clicks proceed to checkout on address screen
    Then Payment screen is displayed
    When User selects payment method
    And User clicks confirm button
    Then Payment was successful is displayed
    Examples:
      | first_name | last_name | date_of_birth | Address              | post_code | city   | state      | country      | phone_no   | email            | password |
      | Justice    | League    | 22/10/2000    | 82  Skeefblom Street | 1387      | Welkom | Free State | South Africa | 0834721722 | delulu@gmail.com | Ju$t1c33 |