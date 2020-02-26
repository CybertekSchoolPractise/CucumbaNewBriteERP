package pages.odoo_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AsUsermainPage {
    public AsUsermainPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (css = ".o_thread_title")
    public WebElement CongratulationTextVerify;

    @FindBy(xpath = "//a[@data-menu='347']")
    public WebElement InventoryButtonVerify;

    @FindBy(xpath = "//a[@data-menu='370']")
    public WebElement InventoryAdjustmentsButton;
}
