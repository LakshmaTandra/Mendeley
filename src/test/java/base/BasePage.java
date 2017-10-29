package base;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public BasePage() {

        PageFactory.initElements(DriverContext.driver,this);
        DriverContext.wait = new WebDriverWait(DriverContext.driver, 20);
    }
}
