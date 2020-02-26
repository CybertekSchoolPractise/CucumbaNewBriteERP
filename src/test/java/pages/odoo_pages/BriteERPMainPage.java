package pages.odoo_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BriteERPMainPage {
    public BriteERPMainPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
    @FindBy(css = ".o_thread_title")
    public WebElement mainPageTextVerify;

    @FindBy(xpath = "//a[@data-menu='347']")
    public WebElement InventoryModuleDisplayVerify;

    @FindBy(xpath = "//a[@data-menu='347']")
    public WebElement InventoryModuleButton;


}
