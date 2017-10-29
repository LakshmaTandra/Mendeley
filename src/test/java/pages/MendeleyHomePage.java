package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class MendeleyHomePage extends BasePage {

    @FindBy(how = How.LINK_TEXT ,using = "Create account")
    public WebElement btnCreateAccount;


    public void clickOnCreateAccount(){

        btnCreateAccount.click();
    }




}
