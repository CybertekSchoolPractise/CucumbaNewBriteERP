package step_definitions.odoo_steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import pages.odoo_pages.*;
import step_definitions.Hukes;
import utilities.Config;
import utilities.Driver;

public class BriteERP_Inventory_Adjustments {
    BriteERPLoginPages briteERPLoginPages = new BriteERPLoginPages();
    BriteERPMainPage briteERPMainPage =  new BriteERPMainPage();
    InventoryModulePage inventoryModulePage = new InventoryModulePage();
    InsideInventoryAdjustmentsPage insideInventoryAdjustmentsPage= new InsideInventoryAdjustmentsPage();
    InsideSearchAfterSearch insideSearchAfterSearch = new InsideSearchAfterSearch();
    AsUsermainPage asUsermainPage = new AsUsermainPage();
    AsUserInventoryAdjustmentsPage asUserInventoryAdjustmentsPage = new AsUserInventoryAdjustmentsPage();

    @Given("As a Manager, i am login page, I should be able to see and fill info in login box")
    public void as_a_Manager_i_am_login_page_I_should_be_able_to_see_and_fill_info_in_login_box() {
        Hukes hukes = new Hukes();
        hukes.setUp();



    }

    @When("As a Manager, i am in the main menu page")
    public void as_a_Manager_i_am_in_the_main_menu_page() {
    // after login user should see "Congratulations!" text
       Assert.assertTrue("Congrats text verification FAILED!",briteERPMainPage
               .mainPageTextVerify.isDisplayed());
    }
    @When("As a manager, i should be able to see Inventory module")
    public void as_a_manager_i_should_be_able_to_see_Inventory_module() {
       Assert.assertTrue("Inventory module Button is NOT displayed",briteERPMainPage
               .InventoryModuleDisplayVerify.isDisplayed());
    }

    @Then("As a Manager, requester should click Inventory tab")
    public void as_a_Manager_requester_should_click_Inventory_tab() {
        briteERPMainPage.InventoryModuleButton.click();

    }

    @Then("Requester can see on the landing page, which inside Dashboard Operations, Inventory Adjustments functionality")
    public void requester_can_see_on_the_landing_page_which_inside_Dashboard_Operations_Inventory_Adjustments_functionality() {
        Assert.assertTrue("Inventory Adjustments button is NOT displayed!",
                inventoryModulePage.inventoryAdjustmentsVerify.isDisplayed());
    }

    @When("As a Manager, Requester clicks Inventory Adjustments button")
    public void as_a_Manager_Requester_clicks_Inventory_Adjustments_button() {
        inventoryModulePage.inventoryAdjustmentsButton.click();
    }

    @Then("Requester has to see Create, Import and Search buttons on the landing page")
    public void requester_has_to_see_Create_Import_and_Search_buttons_on_the_landing_page() {
    Assert.assertTrue("Create button is NOT displayed!",
            insideInventoryAdjustmentsPage.createButtonVerify.isDisplayed());
    Assert.assertTrue("Import button is NOT displayed!",
            insideInventoryAdjustmentsPage.importButtonVerify.isDisplayed());
    Assert.assertTrue("Search box is NOT displayed",
            insideInventoryAdjustmentsPage.searchBoxVerify.isDisplayed());

    }

    @Then("As a manager, requester should be able to click all three buttons")
    public void as_a_manager_requester_should_be_able_to_click_all_three_buttons() {
    insideInventoryAdjustmentsPage.createButtonVerify.click();
    insideInventoryAdjustmentsPage.alertAcceptButton.click();

    insideInventoryAdjustmentsPage.importButtonVerify.click();
    insideInventoryAdjustmentsPage.cancelButtonPress.click();

    insideInventoryAdjustmentsPage.searchBoxVerify.click();
    }

    @When("as a manager i should click the search button to type and to find exact products")
    public void as_a_manager_i_should_click_the_search_button_to_type_and_to_find_exact_products() throws InterruptedException {
       // click to search button
        Thread.sleep(3000);
        insideInventoryAdjustmentsPage.searchBoxVerify.sendKeys(Config
                .getProperty("ItemForSearch") + Keys.ENTER);
    }

    @When("search funclitonalty should offer all products which we are trying to find")
    public void search_funclitonalty_should_offer_all_products_which_we_are_trying_to_find() throws InterruptedException{
        Assert.assertTrue(true);
        Thread.sleep(3000);
    }

    @Then("as  a  manager i can choose any of them")
    public void as_a_manager_i_can_choose_any_of_them() {
    insideSearchAfterSearch.firstTextVerify.click();

    }
    @Given("As a User, i am login page, I should be able to see and fill info in the box")
    public void as_a_User_i_am_login_page_I_should_be_able_to_see_and_fill_info_in_the_box() {
        Driver.getDriver().get(Config.getProperty("inventoryUrl"));
        // as a user i can enter the userName
    briteERPLoginPages.usernameInputBox.sendKeys(Config.getProperty("UserUsernameJurabek"));
    // as a user i can enter the Password
    briteERPLoginPages.passwordInputBox.sendKeys(Config.getProperty("UserPasswordJurabek"));
    // as a user i can click submit button
        briteERPLoginPages.submitButton.click();
    }

    @When("As a user, i am in the main menu page")
    public void as_a_user_i_am_in_the_main_menu_page() {
        // user can see the "Congratulation" text
        Assert.assertTrue("Congratulation text is NOT displayed!",
                asUsermainPage.CongratulationTextVerify.isDisplayed());

    }

    @Then("As a user, requester should click Inventory tab")
    public void as_a_user_requester_should_click_Inventory_tab() {
        // verifying Inventory tab
        asUsermainPage.InventoryButtonVerify.click();
    }

    @When("As a user, Requester clicks Inventory Adjustments button")
    public void as_a_user_Requester_clicks_Inventory_Adjustments_button() {
    asUsermainPage.InventoryAdjustmentsButton.click();
    }

    @Then("As a user, requester should be able to click all three buttons")
    public void as_a_user_requester_should_be_able_to_click_all_three_buttons() {
        // click the create button
    asUserInventoryAdjustmentsPage.CreateButton.click();
    // accept the alert
        asUserInventoryAdjustmentsPage.alertAcceptButton.click();
        // click the import button
        asUserInventoryAdjustmentsPage.importButtonVerify.click();
        // click the cancel button
        asUserInventoryAdjustmentsPage.cancelButtonPress.click();
        // go to search button and click to it
        asUserInventoryAdjustmentsPage.searchBoxVerify.click();

    }
    // so, guys lets finish project !
    @Given("as a user when i login and navigate to inventory adjustments to be able to see search button")
    public void as_a_user_when_i_login_and_navigate_to_inventory_adjustments_to_be_able_to_see_search_button() {
        Driver.getDriver().get(Config.getProperty("inventoryUrl"));
        // as a user i can enter the userName
        briteERPLoginPages.usernameInputBox.sendKeys(Config.getProperty("UserUsernameJurabek"));
        // as a user i can enter the Password
        briteERPLoginPages.passwordInputBox.sendKeys(Config.getProperty("UserPasswordJurabek"));
        // as a user i can click submit button
        briteERPLoginPages.submitButton.click();
        // click to Inventory tab
        asUsermainPage.InventoryButtonVerify.click();
        // click to Inventory Adjustments button
        asUsermainPage.InventoryAdjustmentsButton.click();


    }

    @When("as a user i should click the search button to type and to find exact products")
    public void as_a_user_i_should_click_the_search_button_to_type_and_to_find_exact_products() {
        // click to search box Button
        asUserInventoryAdjustmentsPage.searchBoxVerify.click();
        // enter the "apple" text
        asUserInventoryAdjustmentsPage.searchBoxVerify.sendKeys(Config
                .getProperty("ItemForSearch") + Keys.ENTER);
    }

    @Then("as  a  user i can choose any of them")
    public void as_a_user_i_can_choose_any_of_them() {
    Assert.assertTrue("Verifying the product is FAILED!",
            insideSearchAfterSearch.firstTextVerify.isDisplayed());
    }


}
