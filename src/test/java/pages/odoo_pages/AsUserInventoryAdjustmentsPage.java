package pages.odoo_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AsUserInventoryAdjustmentsPage {
    public AsUserInventoryAdjustmentsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    public WebElement CreateButton;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButtonVerify;

    @FindBy(xpath = "//input[@class='o_searchview_input']")
    public WebElement searchBoxVerify;

    @FindBy(xpath = "//button[@class='btn btn-sm btn-primary']")
    public WebElement alertAcceptButton;
    // cancel button
    @FindBy(xpath = "//button[.='Cancel']")
    public WebElement cancelButtonPress;
}
