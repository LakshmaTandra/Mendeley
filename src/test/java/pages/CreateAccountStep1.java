package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static base.DriverContext.wait;

public class CreateAccountStep1 extends BasePage {

    @FindBy(how = How.ID , using = "email")
    public WebElement txtEmailAddress;

    @FindBy(how = How.ID , using = "first_name")
    public WebElement txtFirstName;

    @FindBy(how = How.ID , using = "last_name")
    public WebElement txtLastName;

    @FindBy(how = How.ID , using = "password")
    public WebElement txtPassword;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    public WebElement btnContinue;



    public void enterAccountDetails(String emailID, String firstName, String lastName , String Password){
        wait.until(ExpectedConditions.visibilityOf(txtEmailAddress));

        txtEmailAddress.sendKeys(emailID);
        txtFirstName.sendKeys(firstName);
        txtLastName.sendKeys(lastName);
        txtPassword.sendKeys(Password);

        wait.until(ExpectedConditions.elementToBeClickable(btnContinue));
        btnContinue.click();
    }






}
