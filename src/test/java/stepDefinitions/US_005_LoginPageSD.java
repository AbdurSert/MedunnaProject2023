package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.US_005_LoginPage;
import utilities.ConfigReader;
import utilities.Driver;

public class US_005_LoginPageSD {

    US_005_LoginPage us_005_loginPage = new US_005_LoginPage();

    @Given("The user goes to the homepage")
    public void theUserGoesToTheHomepage() {
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @When("The user clicks the profile menu")
    public void theUserClicksTheProfileMenu() {
        us_005_loginPage.profileMenu.click();
    }

    @When("The user clicks the sign in link")
    public void theUserClicksTheSignInLink() {
        us_005_loginPage.signInLink.click();
    }

    @When("The user clicks the username's text box")
    public void theUserClicksTheUsernameSTextBox() {
        us_005_loginPage.username.click();

    }

    @And("The user enters invalid username")
    public void theUserEntersInvalidUsername() {
        us_005_loginPage.username.sendKeys("user202");
    }

    @When("The user clicks the password's text box")
    public void theUserClicksThePasswordSTextBox() {
        us_005_loginPage.newPassword.click();
    }

    @And("The user enters valid password")
    public void theUserEntersValidPassword() {
        us_005_loginPage.newPassword.sendKeys("User.Name23");
    }

    @And("The user clicks the sign in button")
    public void theUserClicksTheSignInButton() {
        us_005_loginPage.signInLogin.click();
    }

    @Then("The user sees the text of the error message")
    public void theUserSeesTheTextOfTheErrorMessage() {
        Assert.assertTrue(us_005_loginPage.errorMessage.isDisplayed());
    }

    @And("The user enters valid username")
    public void theUserEntersValidUsername() {
    }

    @And("The user enters invalid password")
    public void theUserEntersInvalidPassword() {
    }

    @When("The user clicks the label of {string}")
    public void theUserClicksTheLabelOf(String arg0) {
    }

    @Then("The user sees the text of {string}")
    public void theUserSeesTheTextOf(String arg0) {
    }

    @Then("The user sees redirected to Registration page.")
    public void theUserSeesRedirectedToRegistrationPage() {
    }


}
