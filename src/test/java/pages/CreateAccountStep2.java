package pages;


import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import static base.DriverContext.wait;

public class CreateAccountStep2 extends BasePage{

    @FindBy(how = How.ID,using = "subject_area")
    public WebElement optFieldOfStudy;

    @FindBy(how = How.ID , using = "user_role")
    public WebElement optAcademicStatus;


    @FindBy(how = How.ID ,using = "join-form-submit")
    public WebElement btnCreateAccount;




    public void selectFieldOfStudyAndAcademicStatusByIndex(int opt1 , int opt2) {
        wait.until(ExpectedConditions.visibilityOf(optFieldOfStudy));

        Select option1 = new Select(optFieldOfStudy);
        option1.selectByIndex(opt1);

        Select option2 = new Select(optAcademicStatus);
        option2.selectByIndex(opt2);

        btnCreateAccount.submit();


    }

    public void selectFieldOfStudyAndAcademicStatusByValue(String opt1 , String opt2) {
        wait.until(ExpectedConditions.visibilityOf(optFieldOfStudy));

        Select option1 = new Select(optFieldOfStudy);
        option1.selectByValue(opt1);

        Select option2 = new Select(optAcademicStatus);
        option2.selectByValue(opt2);

        btnCreateAccount.submit();


    }






}
