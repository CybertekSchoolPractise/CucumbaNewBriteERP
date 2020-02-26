@regression
Feature:As a Manager I have to be able use, manage Intentory Adjustments which is located (Inventory tab and Dashboars Operations sections)


  Scenario: login and should be able to see inventory module and Inventory Adjustments

    Given As a Manager, i am login page, I should be able to see and fill info in login box
    When As a Manager, i am in the main menu page
    And As a manager, i should be able to see Inventory module
    Then As a Manager, requester should click Inventory tab
    Then Requester can see on the landing page, which inside Dashboard Operations, Inventory Adjustments functionality
    When As a Manager, Requester clicks Inventory Adjustments button
    Then Requester has to see Create, Import and Search buttons on the landing page
    And As a manager, requester should be able to click all three buttons



  Scenario: Search functionality for managers

    Given As a Manager, i am login page, I should be able to see and fill info in login box
    When As a Manager, i am in the main menu page
    And As a manager, i should be able to see Inventory module
    Then As a Manager, requester should click Inventory tab
    Then Requester can see on the landing page, which inside Dashboard Operations, Inventory Adjustments functionality
    When As a Manager, Requester clicks Inventory Adjustments button
    When as a manager i should click the search button to type and to find exact products
    And search funclitonalty should offer all products which we are trying to find
    Then as  a  manager i can choose any of them

  Scenario:As a User I have to be able use Inventory module

    Given As a User, i am login page, I should be able to see and fill info in the box
    When As a user, i am in the main menu page
    Then As a user, requester should click Inventory tab
    Then Requester can see on the landing page, which inside Dashboard Operations, Inventory Adjustments functionality
    When As a user, Requester clicks Inventory Adjustments button
    Then Requester has to see Create, Import and Search buttons on the landing page
    And As a user, requester should be able to click all three buttons

  Scenario: As a User I have to able to search products from list by using search box(Inventory Adjustments>
    Given as a user when i login and navigate to inventory adjustments to be able to see search button
    When as a user i should click the search button to type and to find exact products
    Then search funclitonalty should offer all products which we are trying to find
    And as  a  user i can choose any of them