package pages.odoo_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InventoryModulePage {
    public InventoryModulePage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@data-menu='370']")
    public WebElement inventoryAdjustmentsVerify;

    @FindBy(xpath = "//a[@data-menu='370']")
    public WebElement inventoryAdjustmentsButton;
        }
