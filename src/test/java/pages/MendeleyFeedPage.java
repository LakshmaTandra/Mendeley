package pages;

import base.BasePage;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static base.DriverContext.wait;

public class MendeleyFeedPage extends BasePage {

    @FindBy(how = How.XPATH ,using = "html/body/header/div/nav[1]/ul/li[10]/a/span")
    public WebElement LoginName;



    public void VerfiyLogin(String FirstName){

        wait.until(ExpectedConditions.visibilityOf(LoginName));
        String userName = LoginName.getText();
        Assert.assertTrue(userName.contains(FirstName));

    }

}
