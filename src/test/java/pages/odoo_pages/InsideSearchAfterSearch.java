package pages.odoo_pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class InsideSearchAfterSearch {
    public InsideSearchAfterSearch(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//td[.='INV: Apple MacBookAir'])[1]")
    public WebElement firstTextVerify;
}
