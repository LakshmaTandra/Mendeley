package steps;

import base.DriverContext;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static base.DriverContext.driver;

public class Hook {


    @Before
    public void intitializeBrowser(){

        System.setProperty("webdriver.gecko.driver",".\\resources\\drivers\\geckodriver.exe");
        DriverContext.driver = new FirefoxDriver();
        DriverContext.driver.manage().window().maximize();
        DriverContext.wait = new WebDriverWait(driver , 20);

    }



    @After
    public void closingBrowser(){

        System.out.println("Closing Browser");
        driver.quit();

    }
}
