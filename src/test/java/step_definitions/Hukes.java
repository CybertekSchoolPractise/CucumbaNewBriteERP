package step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.odoo_pages.BriteERPLoginPages;
import utilities.Config;
import utilities.Driver;

public class Hukes {
    BriteERPLoginPages briteERPLoginPages = new BriteERPLoginPages();
    @BeforeClass
    public void setUp() {
        // as a manager, username enter:  username:inm3@info.com
        // go to the webPage "http://54.148.96.210/web/login"
        Driver.getDriver().get(Config.getProperty("inventoryUrl"));
        briteERPLoginPages.usernameInputBox.sendKeys(Config.getProperty("ManagerUsernameJurabek"));

        // as a manager, password enter:  password:alsfuh7we69
        briteERPLoginPages.passwordInputBox.sendKeys(Config.getProperty("ManagerPasswordJurabek"));
        // as a manager can click submit button
        briteERPLoginPages.submitButton.click();
        // Anything that you want to run before each Scenario

    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");


        }
        Driver.closeDriver();
    }

}