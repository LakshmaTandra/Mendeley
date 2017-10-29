package steps;

import base.DriverContext;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.CreateAccountStep1;
import pages.CreateAccountStep2;
import pages.MendeleyFeedPage;
import pages.MendeleyHomePage;

public class MyStepdefs {
    @Given("^I am on Mendeley homepage$")
    public void iAmOnMendeleyHomepage() throws Throwable {
        DriverContext.driver.get("https://www.mendeley.com/");

    }

    @When("^I click on Create account link$")
    public void iClickOnCreateAccountLink() throws Throwable {
        MendeleyHomePage homepage = new MendeleyHomePage();
        homepage.clickOnCreateAccount();

    }


    @And("^I enter the \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" , \"([^\"]*)\" and click on Continue$")
    public void iEnterTheAndClickOnContinue(String EmailID, String firstname, String lastname, String password) throws Throwable {
        CreateAccountStep1 step1 = new CreateAccountStep1();
        step1.enterAccountDetails(EmailID ,firstname , lastname , password);

    }

    @And("^I select \"([^\"]*)\" and \"([^\"]*)\" and click on Submit$")
    public void iSelectAndAndClickOnSubmit(String option1, String option2) throws Throwable {
        CreateAccountStep2 step2 = new CreateAccountStep2();
        step2.selectFieldOfStudyAndAcademicStatusByValue(option1 , option2);

  }



    @Then("^verify account is created successfully and \"([^\"]*)\" appears on homepage$")
    public void verifyAccountIsCreatedSuccessfullyAndAppearsOnHomepage(String firstName) throws Throwable {
        MendeleyFeedPage Feedpage = new MendeleyFeedPage();
        Feedpage.VerfiyLogin(firstName);

    }
}
